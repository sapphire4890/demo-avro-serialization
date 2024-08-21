/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DemoDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -9069516028725480395L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DemoDTO\",\"fields\":[{\"name\":\"param0\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"param1\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"param2\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DemoDTO> ENCODER =
      new BinaryMessageEncoder<DemoDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DemoDTO> DECODER =
      new BinaryMessageDecoder<DemoDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DemoDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DemoDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DemoDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DemoDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DemoDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DemoDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DemoDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DemoDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String param0;
  private java.lang.String param1;
  private java.lang.String param2;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DemoDTO() {}

  /**
   * All-args constructor.
   * @param param0 The new value for param0
   * @param param1 The new value for param1
   * @param param2 The new value for param2
   */
  public DemoDTO(java.lang.String param0, java.lang.String param1, java.lang.String param2) {
    this.param0 = param0;
    this.param1 = param1;
    this.param2 = param2;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return param0;
    case 1: return param1;
    case 2: return param2;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: param0 = value$ != null ? value$.toString() : null; break;
    case 1: param1 = value$ != null ? value$.toString() : null; break;
    case 2: param2 = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'param0' field.
   * @return The value of the 'param0' field.
   */
  public java.lang.String getParam0() {
    return param0;
  }


  /**
   * Sets the value of the 'param0' field.
   * @param value the value to set.
   */
  public void setParam0(java.lang.String value) {
    this.param0 = value;
  }

  /**
   * Gets the value of the 'param1' field.
   * @return The value of the 'param1' field.
   */
  public java.lang.String getParam1() {
    return param1;
  }


  /**
   * Sets the value of the 'param1' field.
   * @param value the value to set.
   */
  public void setParam1(java.lang.String value) {
    this.param1 = value;
  }

  /**
   * Gets the value of the 'param2' field.
   * @return The value of the 'param2' field.
   */
  public java.lang.String getParam2() {
    return param2;
  }


  /**
   * Sets the value of the 'param2' field.
   * @param value the value to set.
   */
  public void setParam2(java.lang.String value) {
    this.param2 = value;
  }

  /**
   * Creates a new DemoDTO RecordBuilder.
   * @return A new DemoDTO RecordBuilder
   */
  public static DemoDTO.Builder newBuilder() {
    return new DemoDTO.Builder();
  }

  /**
   * Creates a new DemoDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DemoDTO RecordBuilder
   */
  public static DemoDTO.Builder newBuilder(DemoDTO.Builder other) {
    if (other == null) {
      return new DemoDTO.Builder();
    } else {
      return new DemoDTO.Builder(other);
    }
  }

  /**
   * Creates a new DemoDTO RecordBuilder by copying an existing DemoDTO instance.
   * @param other The existing instance to copy.
   * @return A new DemoDTO RecordBuilder
   */
  public static DemoDTO.Builder newBuilder(DemoDTO other) {
    if (other == null) {
      return new DemoDTO.Builder();
    } else {
      return new DemoDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for DemoDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DemoDTO>
    implements org.apache.avro.data.RecordBuilder<DemoDTO> {

    private java.lang.String param0;
    private java.lang.String param1;
    private java.lang.String param2;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(DemoDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.param0)) {
        this.param0 = data().deepCopy(fields()[0].schema(), other.param0);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.param1)) {
        this.param1 = data().deepCopy(fields()[1].schema(), other.param1);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.param2)) {
        this.param2 = data().deepCopy(fields()[2].schema(), other.param2);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing DemoDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(DemoDTO other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.param0)) {
        this.param0 = data().deepCopy(fields()[0].schema(), other.param0);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.param1)) {
        this.param1 = data().deepCopy(fields()[1].schema(), other.param1);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.param2)) {
        this.param2 = data().deepCopy(fields()[2].schema(), other.param2);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'param0' field.
      * @return The value.
      */
    public java.lang.String getParam0() {
      return param0;
    }


    /**
      * Sets the value of the 'param0' field.
      * @param value The value of 'param0'.
      * @return This builder.
      */
    public DemoDTO.Builder setParam0(java.lang.String value) {
      validate(fields()[0], value);
      this.param0 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'param0' field has been set.
      * @return True if the 'param0' field has been set, false otherwise.
      */
    public boolean hasParam0() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'param0' field.
      * @return This builder.
      */
    public DemoDTO.Builder clearParam0() {
      param0 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'param1' field.
      * @return The value.
      */
    public java.lang.String getParam1() {
      return param1;
    }


    /**
      * Sets the value of the 'param1' field.
      * @param value The value of 'param1'.
      * @return This builder.
      */
    public DemoDTO.Builder setParam1(java.lang.String value) {
      validate(fields()[1], value);
      this.param1 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'param1' field has been set.
      * @return True if the 'param1' field has been set, false otherwise.
      */
    public boolean hasParam1() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'param1' field.
      * @return This builder.
      */
    public DemoDTO.Builder clearParam1() {
      param1 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'param2' field.
      * @return The value.
      */
    public java.lang.String getParam2() {
      return param2;
    }


    /**
      * Sets the value of the 'param2' field.
      * @param value The value of 'param2'.
      * @return This builder.
      */
    public DemoDTO.Builder setParam2(java.lang.String value) {
      validate(fields()[2], value);
      this.param2 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'param2' field has been set.
      * @return True if the 'param2' field has been set, false otherwise.
      */
    public boolean hasParam2() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'param2' field.
      * @return This builder.
      */
    public DemoDTO.Builder clearParam2() {
      param2 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DemoDTO build() {
      try {
        DemoDTO record = new DemoDTO();
        record.param0 = fieldSetFlags()[0] ? this.param0 : (java.lang.String) defaultValue(fields()[0]);
        record.param1 = fieldSetFlags()[1] ? this.param1 : (java.lang.String) defaultValue(fields()[1]);
        record.param2 = fieldSetFlags()[2] ? this.param2 : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DemoDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<DemoDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DemoDTO>
    READER$ = (org.apache.avro.io.DatumReader<DemoDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.param0);

    out.writeString(this.param1);

    out.writeString(this.param2);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.param0 = in.readString();

      this.param1 = in.readString();

      this.param2 = in.readString();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.param0 = in.readString();
          break;

        case 1:
          this.param1 = in.readString();
          break;

        case 2:
          this.param2 = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










