/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-12-20")
public class Edge implements org.apache.thrift.TBase<Edge, Edge._Fields>, java.io.Serializable, Cloneable, Comparable<Edge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Edge");

  private static final org.apache.thrift.protocol.TField VERTEX_ORIGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("vertexOrigin", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VERTEX_DESTINY_FIELD_DESC = new org.apache.thrift.protocol.TField("vertexDestiny", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField IS_DIRECTED_FIELD_DESC = new org.apache.thrift.protocol.TField("isDirected", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EdgeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EdgeTupleSchemeFactory();

  public int vertexOrigin; // required
  public int vertexDestiny; // required
  public java.lang.String description; // required
  public double weight; // required
  public int isDirected; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERTEX_ORIGIN((short)1, "vertexOrigin"),
    VERTEX_DESTINY((short)2, "vertexDestiny"),
    DESCRIPTION((short)3, "description"),
    WEIGHT((short)4, "weight"),
    IS_DIRECTED((short)5, "isDirected");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERTEX_ORIGIN
          return VERTEX_ORIGIN;
        case 2: // VERTEX_DESTINY
          return VERTEX_DESTINY;
        case 3: // DESCRIPTION
          return DESCRIPTION;
        case 4: // WEIGHT
          return WEIGHT;
        case 5: // IS_DIRECTED
          return IS_DIRECTED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VERTEXORIGIN_ISSET_ID = 0;
  private static final int __VERTEXDESTINY_ISSET_ID = 1;
  private static final int __WEIGHT_ISSET_ID = 2;
  private static final int __ISDIRECTED_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERTEX_ORIGIN, new org.apache.thrift.meta_data.FieldMetaData("vertexOrigin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VERTEX_DESTINY, new org.apache.thrift.meta_data.FieldMetaData("vertexDestiny", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.IS_DIRECTED, new org.apache.thrift.meta_data.FieldMetaData("isDirected", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Edge.class, metaDataMap);
  }

  public Edge() {
  }

  public Edge(
    int vertexOrigin,
    int vertexDestiny,
    java.lang.String description,
    double weight,
    int isDirected)
  {
    this();
    this.vertexOrigin = vertexOrigin;
    setVertexOriginIsSet(true);
    this.vertexDestiny = vertexDestiny;
    setVertexDestinyIsSet(true);
    this.description = description;
    this.weight = weight;
    setWeightIsSet(true);
    this.isDirected = isDirected;
    setIsDirectedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Edge(Edge other) {
    __isset_bitfield = other.__isset_bitfield;
    this.vertexOrigin = other.vertexOrigin;
    this.vertexDestiny = other.vertexDestiny;
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    this.weight = other.weight;
    this.isDirected = other.isDirected;
  }

  public Edge deepCopy() {
    return new Edge(this);
  }

  @Override
  public void clear() {
    setVertexOriginIsSet(false);
    this.vertexOrigin = 0;
    setVertexDestinyIsSet(false);
    this.vertexDestiny = 0;
    this.description = null;
    setWeightIsSet(false);
    this.weight = 0.0;
    setIsDirectedIsSet(false);
    this.isDirected = 0;
  }

  public int getVertexOrigin() {
    return this.vertexOrigin;
  }

  public Edge setVertexOrigin(int vertexOrigin) {
    this.vertexOrigin = vertexOrigin;
    setVertexOriginIsSet(true);
    return this;
  }

  public void unsetVertexOrigin() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERTEXORIGIN_ISSET_ID);
  }

  /** Returns true if field vertexOrigin is set (has been assigned a value) and false otherwise */
  public boolean isSetVertexOrigin() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERTEXORIGIN_ISSET_ID);
  }

  public void setVertexOriginIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERTEXORIGIN_ISSET_ID, value);
  }

  public int getVertexDestiny() {
    return this.vertexDestiny;
  }

  public Edge setVertexDestiny(int vertexDestiny) {
    this.vertexDestiny = vertexDestiny;
    setVertexDestinyIsSet(true);
    return this;
  }

  public void unsetVertexDestiny() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERTEXDESTINY_ISSET_ID);
  }

  /** Returns true if field vertexDestiny is set (has been assigned a value) and false otherwise */
  public boolean isSetVertexDestiny() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERTEXDESTINY_ISSET_ID);
  }

  public void setVertexDestinyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERTEXDESTINY_ISSET_ID, value);
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public Edge setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public double getWeight() {
    return this.weight;
  }

  public Edge setWeight(double weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  public int getIsDirected() {
    return this.isDirected;
  }

  public Edge setIsDirected(int isDirected) {
    this.isDirected = isDirected;
    setIsDirectedIsSet(true);
    return this;
  }

  public void unsetIsDirected() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISDIRECTED_ISSET_ID);
  }

  /** Returns true if field isDirected is set (has been assigned a value) and false otherwise */
  public boolean isSetIsDirected() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISDIRECTED_ISSET_ID);
  }

  public void setIsDirectedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISDIRECTED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case VERTEX_ORIGIN:
      if (value == null) {
        unsetVertexOrigin();
      } else {
        setVertexOrigin((java.lang.Integer)value);
      }
      break;

    case VERTEX_DESTINY:
      if (value == null) {
        unsetVertexDestiny();
      } else {
        setVertexDestiny((java.lang.Integer)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((java.lang.Double)value);
      }
      break;

    case IS_DIRECTED:
      if (value == null) {
        unsetIsDirected();
      } else {
        setIsDirected((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VERTEX_ORIGIN:
      return getVertexOrigin();

    case VERTEX_DESTINY:
      return getVertexDestiny();

    case DESCRIPTION:
      return getDescription();

    case WEIGHT:
      return getWeight();

    case IS_DIRECTED:
      return getIsDirected();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VERTEX_ORIGIN:
      return isSetVertexOrigin();
    case VERTEX_DESTINY:
      return isSetVertexDestiny();
    case DESCRIPTION:
      return isSetDescription();
    case WEIGHT:
      return isSetWeight();
    case IS_DIRECTED:
      return isSetIsDirected();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Edge)
      return this.equals((Edge)that);
    return false;
  }

  public boolean equals(Edge that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_vertexOrigin = true;
    boolean that_present_vertexOrigin = true;
    if (this_present_vertexOrigin || that_present_vertexOrigin) {
      if (!(this_present_vertexOrigin && that_present_vertexOrigin))
        return false;
      if (this.vertexOrigin != that.vertexOrigin)
        return false;
    }

    boolean this_present_vertexDestiny = true;
    boolean that_present_vertexDestiny = true;
    if (this_present_vertexDestiny || that_present_vertexDestiny) {
      if (!(this_present_vertexDestiny && that_present_vertexDestiny))
        return false;
      if (this.vertexDestiny != that.vertexDestiny)
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_weight = true;
    boolean that_present_weight = true;
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    boolean this_present_isDirected = true;
    boolean that_present_isDirected = true;
    if (this_present_isDirected || that_present_isDirected) {
      if (!(this_present_isDirected && that_present_isDirected))
        return false;
      if (this.isDirected != that.isDirected)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + vertexOrigin;

    hashCode = hashCode * 8191 + vertexDestiny;

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + description.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(weight);

    hashCode = hashCode * 8191 + isDirected;

    return hashCode;
  }

  @Override
  public int compareTo(Edge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetVertexOrigin()).compareTo(other.isSetVertexOrigin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVertexOrigin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vertexOrigin, other.vertexOrigin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVertexDestiny()).compareTo(other.isSetVertexDestiny());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVertexDestiny()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vertexDestiny, other.vertexDestiny);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsDirected()).compareTo(other.isSetIsDirected());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDirected()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isDirected, other.isDirected);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Edge(");
    boolean first = true;

    sb.append("vertexOrigin:");
    sb.append(this.vertexOrigin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("vertexDestiny:");
    sb.append(this.vertexDestiny);
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("weight:");
    sb.append(this.weight);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isDirected:");
    sb.append(this.isDirected);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EdgeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EdgeStandardScheme getScheme() {
      return new EdgeStandardScheme();
    }
  }

  private static class EdgeStandardScheme extends org.apache.thrift.scheme.StandardScheme<Edge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Edge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERTEX_ORIGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.vertexOrigin = iprot.readI32();
              struct.setVertexOriginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERTEX_DESTINY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.vertexDestiny = iprot.readI32();
              struct.setVertexDestinyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.weight = iprot.readDouble();
              struct.setWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_DIRECTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.isDirected = iprot.readI32();
              struct.setIsDirectedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Edge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERTEX_ORIGIN_FIELD_DESC);
      oprot.writeI32(struct.vertexOrigin);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERTEX_DESTINY_FIELD_DESC);
      oprot.writeI32(struct.vertexDestiny);
      oprot.writeFieldEnd();
      if (struct.description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.description);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
      oprot.writeDouble(struct.weight);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_DIRECTED_FIELD_DESC);
      oprot.writeI32(struct.isDirected);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EdgeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EdgeTupleScheme getScheme() {
      return new EdgeTupleScheme();
    }
  }

  private static class EdgeTupleScheme extends org.apache.thrift.scheme.TupleScheme<Edge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Edge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetVertexOrigin()) {
        optionals.set(0);
      }
      if (struct.isSetVertexDestiny()) {
        optionals.set(1);
      }
      if (struct.isSetDescription()) {
        optionals.set(2);
      }
      if (struct.isSetWeight()) {
        optionals.set(3);
      }
      if (struct.isSetIsDirected()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetVertexOrigin()) {
        oprot.writeI32(struct.vertexOrigin);
      }
      if (struct.isSetVertexDestiny()) {
        oprot.writeI32(struct.vertexDestiny);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetWeight()) {
        oprot.writeDouble(struct.weight);
      }
      if (struct.isSetIsDirected()) {
        oprot.writeI32(struct.isDirected);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Edge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.vertexOrigin = iprot.readI32();
        struct.setVertexOriginIsSet(true);
      }
      if (incoming.get(1)) {
        struct.vertexDestiny = iprot.readI32();
        struct.setVertexDestinyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.weight = iprot.readDouble();
        struct.setWeightIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isDirected = iprot.readI32();
        struct.setIsDirectedIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

