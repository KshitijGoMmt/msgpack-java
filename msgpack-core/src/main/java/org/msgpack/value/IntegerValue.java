//
// MessagePack for Java
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.
//
package org.msgpack.value;

import org.msgpack.core.MessageFormat;

import java.math.BigInteger;

/**
 * The interface {@code IntegerValue} represents MessagePack's Integer type.
 * <p/>
 * MessagePack's Integer type can represent from -2<sup>63</sup> to 2<sup>64</sup>-1.
 */
public interface IntegerValue
        extends NumberValue
{
    /**
     * Returns true if the value is in the range of [-2<sup>7</sup> to 2<sup>7</sup>-1].
     */
    boolean isInByteRange();

    /**
     * Returns true if the value is in the range of [-2<sup>15</sup> to 2<sup>15</sup>-1]
     */
    boolean isInShortRange();

    /**
     * Returns true if the value is in the range of [-2<sup>31</sup> to 2<sup>31</sup>-1]
     */
    boolean isInIntRange();

    /**
     * Returns true if the value is in the range of [-2<sup>63</sup> to 2<sup>63</sup>-1]
     */
    boolean isInLongRange();

    /**
     * Returns the most succinct MessageFormat type to represent this integer value.
     * @return
     */
    MessageFormat mostSuccinctMessageFormat();

    /**
     * Returns the value as a {@code byte}, otherwise throws an exception.
     *
     * @throws MessageIntegerOverflowException If the value does not fit in the range of {@code byte} type.
     */
    byte getByte();

    /**
     * Returns the value as a {@code short}, otherwise throws an exception.
     *
     * @throws MessageIntegerOverflowException If the value does not fit in the range of {@code short} type.
     */
    short getShort();

    /**
     * Returns the value as an {@code int}, otherwise throws an exception.
     *
     * @throws MessageIntegerOverflowException If the value does not fit in the range of {@code int} type.
     */
    int getInt();

    /**
     * Returns the value as a {@code long}, otherwise throws an exception.
     *
     * @throws MessageIntegerOverflowException If the value does not fit in the range of {@code long} type.
     */
    long getLong();

    /**
     * Returns the value as a {@code BigInteger}.
     */
    BigInteger getBigInteger();
}
