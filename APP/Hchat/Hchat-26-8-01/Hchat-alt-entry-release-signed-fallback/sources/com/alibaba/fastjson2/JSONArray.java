package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends java.util.ArrayList<java.lang.Object> {
    static com.alibaba.fastjson2.writer.ObjectWriter<com.alibaba.fastjson2.JSONArray> arrayWriter = null;
    private static final long serialVersionUID = 1;

    public JSONArray() {
            r0 = this;
            r0.<init>()
            return
    }

    public JSONArray(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JSONArray(java.util.Collection<?> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JSONArray(java.lang.Object... r4) {
            r3 = this;
            int r0 = r4.length
            r3.<init>(r0)
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            super.add(r2)
            int r1 = r1 + 1
            goto L6
        L10:
            return
    }

    public static com.alibaba.fastjson2.JSONArray copyOf(java.util.Collection r1) {
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray from(java.lang.Object r0) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.toJSON(r0)
            com.alibaba.fastjson2.JSONArray r0 = (com.alibaba.fastjson2.JSONArray) r0
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray from(java.lang.Object r0, com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.toJSON(r0, r1)
            com.alibaba.fastjson2.JSONArray r0 = (com.alibaba.fastjson2.JSONArray) r0
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray of(java.lang.Object r2) {
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r1 = 1
            r0.<init>(r1)
            r0.add(r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray of(java.lang.Object r2, java.lang.Object r3) {
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r1 = 2
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray of(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r1 = 3
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray of(java.lang.Object... r1) {
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray parse(java.lang.String r0, com.alibaba.fastjson2.JSONReader.Feature... r1) {
            com.alibaba.fastjson2.JSONArray r0 = com.alibaba.fastjson2.JSON.parseArray(r0, r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONArray parseArray(java.lang.String r0, com.alibaba.fastjson2.JSONReader.Feature... r1) {
            com.alibaba.fastjson2.JSONArray r0 = com.alibaba.fastjson2.JSON.parseArray(r0, r1)
            return r0
    }

    public static <T> java.util.List<T> parseArray(java.lang.String r0, java.lang.Class<T> r1) {
            java.util.List r0 = com.alibaba.fastjson2.JSON.parseArray(r0, r1)
            return r0
    }

    public static <T> java.util.List<T> parseArray(java.lang.String r0, java.lang.Class<T> r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            java.util.List r0 = com.alibaba.fastjson2.JSON.parseArray(r0, r1, r2)
            return r0
    }

    public static java.lang.String toJSONString(java.lang.Object r0, com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            java.lang.String r0 = com.alibaba.fastjson2.JSON.toJSONString(r0, r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONArray addArray() {
            r1 = this;
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r0.<init>()
            r1.add(r0)
            return r0
    }

    public com.alibaba.fastjson2.JSONObject addObject() {
            r1 = this;
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r1.add(r0)
            return r0
    }

    @Override // java.util.ArrayList
    public java.lang.Object clone() {
            r1 = this;
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r0.<init>(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONArray fluentAdd(java.lang.Object r1) {
            r0 = this;
            r0.add(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONArray fluentAddAll(java.util.Collection<?> r1) {
            r0 = this;
            r0.addAll(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONArray fluentClear() {
            r0 = this;
            r0.clear()
            return r0
    }

    public com.alibaba.fastjson2.JSONArray fluentRemove(int r1) {
            r0 = this;
            r0.remove(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONArray fluentRemove(java.lang.Object r1) {
            r0 = this;
            r0.remove(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONArray fluentRemoveAll(java.util.Collection<?> r1) {
            r0 = this;
            r0.removeAll(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONArray fluentSet(int r1, java.lang.Object r2) {
            r0 = this;
            r0.set(r1, r2)
            return r0
    }

    public java.math.BigDecimal getBigDecimal(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L48
            boolean r0 = r3 instanceof java.math.BigDecimal
            if (r0 == 0) goto L13
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            return r3
        L13:
            boolean r0 = r3 instanceof java.math.BigInteger
            if (r0 == 0) goto L1f
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            r0.<init>(r3)
            return r0
        L1f:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L2e
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r3)
            return r3
        L2e:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L3d
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r3
        L3d:
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r0)
            return r3
        L48:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L53
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r3)
            return r3
        L53:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L65
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L62
            java.math.BigDecimal r3 = java.math.BigDecimal.ONE
            return r3
        L62:
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            return r3
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to BigDecimal"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public java.math.BigInteger getBigInteger(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L29
            boolean r0 = r3 instanceof java.math.BigInteger
            if (r0 == 0) goto L13
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            return r3
        L13:
            boolean r0 = r3 instanceof java.math.BigDecimal
            if (r0 == 0) goto L1e
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigInteger r3 = r3.toBigInteger()
            return r3
        L1e:
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r0)
            return r3
        L29:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L44
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L43
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L3e
            goto L43
        L3e:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r3)
        L43:
            return r0
        L44:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L56
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L53
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            return r3
        L53:
            java.math.BigInteger r3 = java.math.BigInteger.ZERO
            return r3
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to BigInteger"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public java.lang.Boolean getBoolean(int r5) {
            r4 = this;
            java.lang.Object r5 = r4.get(r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            boolean r1 = r5 instanceof java.lang.Boolean
            if (r1 == 0) goto Lf
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        Lf:
            boolean r1 = r5 instanceof java.lang.Number
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L23
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L1e
            r2 = r3
        L1e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L23:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L4f
            java.lang.String r5 = (java.lang.String) r5
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L4e
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L38
            goto L4e
        L38:
            java.lang.String r0 = "true"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L48
            java.lang.String r0 = "1"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L49
        L48:
            r2 = r3
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L4e:
            return r0
        L4f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to boolean"
            java.lang.String r5 = bc.e.h(r5, r1, r0)
            ah.a.w(r5)
            r5 = 0
            return r5
    }

    public boolean getBooleanValue(int r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.getBoolean(r1)
            if (r1 == 0) goto Le
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public java.lang.Byte getByte(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L17
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L17:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L36
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L35
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L2c
            goto L35
        L2c:
            byte r3 = java.lang.Byte.parseByte(r3)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L35:
            return r0
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to byte"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public byte getByteValue(int r1) {
            r0 = this;
            java.lang.Byte r1 = r0.getByte(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            byte r1 = r1.byteValue()
            return r1
    }

    public java.util.Date getDate(int r6) {
            r5 = this;
            java.lang.Object r6 = r5.get(r6)
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            boolean r1 = r6 instanceof java.util.Date
            if (r1 == 0) goto Lf
            java.util.Date r6 = (java.util.Date) r6
            return r6
        Lf:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L1a
            java.lang.String r6 = (java.lang.String) r6
            java.util.Date r6 = com.alibaba.fastjson2.util.DateUtils.parseDate(r6)
            return r6
        L1a:
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L31
            java.lang.Number r6 = (java.lang.Number) r6
            long r1 = r6.longValue()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L2b
            return r0
        L2b:
            java.util.Date r6 = new java.util.Date
            r6.<init>(r1)
            return r6
        L31:
            java.util.Date r6 = com.alibaba.fastjson2.util.TypeUtils.toDate(r6)
            return r6
    }

    public java.util.Date getDate(int r1, java.util.Date r2) {
            r0 = this;
            java.util.Date r1 = r0.getDate(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            return r1
    }

    public java.lang.Double getDouble(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Double
            if (r1 == 0) goto Lf
            java.lang.Double r3 = (java.lang.Double) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L3c
        L33:
            double r0 = java.lang.Double.parseDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to double"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public double getDoubleValue(int r3) {
            r2 = this;
            java.lang.Double r3 = r2.getDouble(r3)
            if (r3 != 0) goto L9
            r0 = 0
            return r0
        L9:
            double r0 = r3.doubleValue()
            return r0
    }

    public java.lang.Float getFloat(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Float
            if (r1 == 0) goto Lf
            java.lang.Float r3 = (java.lang.Float) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L3c
        L33:
            float r3 = java.lang.Float.parseFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to float"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public float getFloatValue(int r1) {
            r0 = this;
            java.lang.Float r1 = r0.getFloat(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            float r1 = r1.floatValue()
            return r1
    }

    public java.time.Instant getInstant(int r6) {
            r5 = this;
            java.lang.Object r6 = r5.get(r6)
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            boolean r1 = r6 instanceof java.time.Instant
            if (r1 == 0) goto Lf
            java.time.Instant r6 = (java.time.Instant) r6
            return r6
        Lf:
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L25
            java.lang.Number r6 = (java.lang.Number) r6
            long r1 = r6.longValue()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L20
            return r0
        L20:
            java.time.Instant r6 = java.time.Instant.ofEpochMilli(r1)
            return r6
        L25:
            java.time.Instant r6 = com.alibaba.fastjson2.util.TypeUtils.toInstant(r6)
            return r6
    }

    public int getIntValue(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L28
            goto L3c
        L28:
            r0 = 46
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L37
            double r0 = java.lang.Double.parseDouble(r3)
            int r3 = (int) r0
            return r3
        L37:
            int r3 = java.lang.Integer.parseInt(r3)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to int value"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public java.lang.Integer getInteger(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto Lf
            java.lang.Integer r3 = (java.lang.Integer) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L50
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L4f
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L4f
        L33:
            r0 = 46
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L46
            double r0 = java.lang.Double.parseDouble(r3)
            int r3 = (int) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L46:
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L4f:
            return r0
        L50:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L68
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L62
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L62:
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to Integer"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public com.alibaba.fastjson2.JSONArray getJSONArray(int r7) {
            r6 = this;
            java.lang.Object r0 = r6.get(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof com.alibaba.fastjson2.JSONArray
            if (r2 == 0) goto Lf
            com.alibaba.fastjson2.JSONArray r0 = (com.alibaba.fastjson2.JSONArray) r0
            return r0
        Lf:
            boolean r2 = r0 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L44
            java.lang.String r0 = (java.lang.String) r0
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L43
            java.lang.String r7 = "null"
            boolean r7 = r7.equalsIgnoreCase(r0)
            if (r7 == 0) goto L25
            goto L43
        L25:
            char r7 = r0.charAt(r3)
            r1 = 91
            if (r7 == r1) goto L32
            com.alibaba.fastjson2.JSONArray r7 = of(r0)
            return r7
        L32:
            com.alibaba.fastjson2.JSONReader r1 = com.alibaba.fastjson2.JSONReader.of(r0)
            com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONArray> r0 = com.alibaba.fastjson2.JSONFactory.ARRAY_READER
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            com.alibaba.fastjson2.JSONArray r7 = (com.alibaba.fastjson2.JSONArray) r7
            return r7
        L43:
            return r1
        L44:
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L53
            com.alibaba.fastjson2.JSONArray r1 = new com.alibaba.fastjson2.JSONArray
            java.util.Collection r0 = (java.util.Collection) r0
            r1.<init>(r0)
            r6.set(r7, r1)
            return r1
        L53:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L61
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            com.alibaba.fastjson2.JSONArray r0 = of(r0)
            r6.set(r7, r0)
            return r0
        L61:
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L84
            int r1 = java.lang.reflect.Array.getLength(r0)
            com.alibaba.fastjson2.JSONArray r2 = new com.alibaba.fastjson2.JSONArray
            r2.<init>(r1)
        L74:
            if (r3 >= r1) goto L80
            java.lang.Object r4 = java.lang.reflect.Array.get(r0, r3)
            r2.add(r4)
            int r3 = r3 + 1
            goto L74
        L80:
            r6.set(r7, r2)
            return r2
        L84:
            return r1
    }

    public com.alibaba.fastjson2.JSONObject getJSONObject(int r9) {
            r8 = this;
            java.lang.Object r0 = r8.get(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof com.alibaba.fastjson2.JSONObject
            if (r2 == 0) goto Lf
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
            return r0
        Lf:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L36
            java.lang.String r0 = (java.lang.String) r0
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L35
            java.lang.String r9 = "null"
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L24
            goto L35
        L24:
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r0)
            com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONObject> r2 = com.alibaba.fastjson2.JSONFactory.OBJECT_READER
            r5 = 0
            r6 = 0
            r4 = 0
            java.lang.Object r9 = r2.readObject(r3, r4, r5, r6)
            com.alibaba.fastjson2.JSONObject r9 = (com.alibaba.fastjson2.JSONObject) r9
            return r9
        L35:
            return r1
        L36:
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L45
            com.alibaba.fastjson2.JSONObject r1 = new com.alibaba.fastjson2.JSONObject
            java.util.Map r0 = (java.util.Map) r0
            r1.<init>(r0)
            r8.set(r9, r1)
            return r1
        L45:
            java.lang.Class r1 = r0.getClass()
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectWriterProvider()
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r1)
            boolean r2 = r1 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r2 == 0) goto L5c
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r1 = (com.alibaba.fastjson2.writer.ObjectWriterAdapter) r1
            com.alibaba.fastjson2.JSONObject r0 = r1.toJSONObject(r0)
            goto L62
        L5c:
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.toJSON(r0)
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
        L62:
            r8.set(r9, r0)
            return r0
    }

    public java.time.LocalDate getLocalDate(int r2) {
            r1 = this;
            r0 = 0
            java.time.LocalDate r2 = r1.getLocalDate(r2, r0)
            return r2
    }

    public java.time.LocalDate getLocalDate(int r1, java.time.LocalDate r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.LocalDate
            if (r2 == 0) goto Le
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            return r1
        Le:
            java.lang.Class<java.time.LocalDate> r2 = java.time.LocalDate.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            return r1
    }

    public java.time.LocalDateTime getLocalDateTime(int r2) {
            r1 = this;
            r0 = 0
            java.time.LocalDateTime r2 = r1.getLocalDateTime(r2, r0)
            return r2
    }

    public java.time.LocalDateTime getLocalDateTime(int r1, java.time.LocalDateTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.LocalDateTime
            if (r2 == 0) goto Le
            java.time.LocalDateTime r1 = (java.time.LocalDateTime) r1
            return r1
        Le:
            java.lang.Class<java.time.LocalDateTime> r2 = java.time.LocalDateTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.LocalDateTime r1 = (java.time.LocalDateTime) r1
            return r1
    }

    public java.time.LocalTime getLocalTime(int r2) {
            r1 = this;
            r0 = 0
            java.time.LocalTime r2 = r1.getLocalTime(r2, r0)
            return r2
    }

    public java.time.LocalTime getLocalTime(int r1, java.time.LocalTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.LocalTime
            if (r2 == 0) goto Le
            java.time.LocalTime r1 = (java.time.LocalTime) r1
            return r1
        Le:
            java.lang.Class<java.time.LocalTime> r2 = java.time.LocalTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.LocalTime r1 = (java.time.LocalTime) r1
            return r1
    }

    public java.lang.Long getLong(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Long
            if (r1 == 0) goto Lf
            java.lang.Long r3 = (java.lang.Long) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L50
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L4f
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L4f
        L33:
            r0 = 46
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L46
            double r0 = java.lang.Double.parseDouble(r3)
            long r0 = (long) r0
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L46:
            long r0 = java.lang.Long.parseLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L4f:
            return r0
        L50:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L6a
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L63
            r0 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L63:
            r0 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to Long"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public long getLongValue(int r4) {
            r3 = this;
            java.lang.Object r4 = r3.get(r4)
            r0 = 0
            if (r4 != 0) goto L9
            return r0
        L9:
            boolean r2 = r4 instanceof java.lang.Number
            if (r2 == 0) goto L14
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            return r0
        L14:
            boolean r2 = r4 instanceof java.lang.String
            if (r2 == 0) goto L3d
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L3c
            java.lang.String r2 = "null"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L29
            goto L3c
        L29:
            r0 = 46
            int r0 = r4.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L38
            double r0 = java.lang.Double.parseDouble(r4)
            long r0 = (long) r0
            return r0
        L38:
            long r0 = java.lang.Long.parseLong(r4)
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to long value"
            java.lang.String r4 = bc.e.h(r4, r1, r0)
            ah.a.w(r4)
            r0 = 0
            return r0
    }

    public <T> T getObject(int r12, java.lang.Class<T> r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            r11 = this;
            java.lang.Object r12 = r11.get(r12)
            r0 = 0
            if (r12 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r12.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.util.function.Function r1 = r2.getTypeConvert(r1, r13)
            if (r1 == 0) goto L19
            java.lang.Object r12 = r1.apply(r12)
            return r12
        L19:
            int r1 = r14.length
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
        L1f:
            if (r3 >= r1) goto L2e
            r7 = r14[r3]
            long r8 = r7.mask
            long r5 = r5 | r8
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r7 != r8) goto L2b
            r4 = 1
        L2b:
            int r3 = r3 + 1
            goto L1f
        L2e:
            boolean r1 = r12 instanceof java.util.Map
            if (r1 == 0) goto L3d
            com.alibaba.fastjson2.reader.ObjectReader r13 = r2.getObjectReader(r13, r4)
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r13.createInstance(r12, r5)
            return r12
        L3d:
            boolean r1 = r12 instanceof java.util.Collection
            if (r1 == 0) goto L4c
            com.alibaba.fastjson2.reader.ObjectReader r13 = r2.getObjectReader(r13, r4)
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r12 = r13.createInstance(r12, r14)
            return r12
        L4c:
            java.lang.Class r13 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r13)
            boolean r1 = r13.isInstance(r12)
            if (r1 == 0) goto L57
            return r12
        L57:
            boolean r1 = r12 instanceof java.lang.String
            if (r1 == 0) goto L87
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L86
            java.lang.String r3 = "null"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L6d
            goto L86
        L6d:
            boolean r3 = r13.isEnum()
            if (r3 == 0) goto L87
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.getObjectReader(r13, r4)
            boolean r3 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            if (r3 == 0) goto L87
            long r12 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r0 = (com.alibaba.fastjson2.reader.ObjectReaderImplEnum) r0
            java.lang.Enum r12 = r0.getEnumByHashCode(r12)
            return r12
        L86:
            return r0
        L87:
            java.lang.String r12 = com.alibaba.fastjson2.JSON.toJSONString(r12)
            com.alibaba.fastjson2.JSONReader r6 = com.alibaba.fastjson2.JSONReader.of(r12)
            com.alibaba.fastjson2.JSONReader$Context r1 = r6.context
            r1.config(r14)
            if (r0 != 0) goto L9a
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.getObjectReader(r13, r4)
        L9a:
            r5 = r0
            r8 = 0
            r9 = 0
            r7 = 0
            java.lang.Object r13 = r5.readObject(r6, r7, r8, r9)
            boolean r14 = r6.isEnd()
            if (r14 == 0) goto Laa
            return r13
        Laa:
            java.lang.String r13 = "not support input "
            java.lang.String r12 = wb.en.g(r13, r12)
            ah.a.w(r12)
            r12 = 0
            return r12
    }

    public <T> T getObject(int r11, java.lang.reflect.Type r12, com.alibaba.fastjson2.JSONReader.Feature... r13) {
            r10 = this;
            java.lang.Object r11 = r10.get(r11)
            if (r11 != 0) goto L8
            r11 = 0
            return r11
        L8:
            java.lang.Class r0 = r11.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.util.function.Function r0 = r1.getTypeConvert(r0, r12)
            if (r0 == 0) goto L19
            java.lang.Object r11 = r0.apply(r11)
            return r11
        L19:
            int r0 = r13.length
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L1f:
            if (r2 >= r0) goto L2e
            r6 = r13[r2]
            long r7 = r6.mask
            long r4 = r4 | r7
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r6 != r7) goto L2b
            r3 = 1
        L2b:
            int r2 = r2 + 1
            goto L1f
        L2e:
            boolean r0 = r11 instanceof java.util.Map
            if (r0 == 0) goto L3d
            com.alibaba.fastjson2.reader.ObjectReader r12 = r1.getObjectReader(r12, r3)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r12.createInstance(r11, r4)
            return r11
        L3d:
            boolean r0 = r11 instanceof java.util.Collection
            if (r0 == 0) goto L4c
            com.alibaba.fastjson2.reader.ObjectReader r12 = r1.getObjectReader(r12, r3)
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r12.createInstance(r11, r13)
            return r11
        L4c:
            java.lang.Class r12 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r12)
            boolean r0 = r12.isInstance(r11)
            if (r0 == 0) goto L57
            return r11
        L57:
            java.lang.String r11 = com.alibaba.fastjson2.JSON.toJSONString(r11)
            com.alibaba.fastjson2.JSONReader r5 = com.alibaba.fastjson2.JSONReader.of(r11)
            com.alibaba.fastjson2.JSONReader$Context r11 = r5.context
            r11.config(r13)
            com.alibaba.fastjson2.reader.ObjectReader r4 = r1.getObjectReader(r12, r3)
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.Object r11 = r4.readObject(r5, r6, r7, r8)
            return r11
    }

    public <T> T getObject(int r1, java.util.function.Function<com.alibaba.fastjson2.JSONObject, T> r2) {
            r0 = this;
            com.alibaba.fastjson2.JSONObject r1 = r0.getJSONObject(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.apply(r1)
            return r1
    }

    public java.time.OffsetDateTime getOffsetDateTime(int r2) {
            r1 = this;
            r0 = 0
            java.time.OffsetDateTime r2 = r1.getOffsetDateTime(r2, r0)
            return r2
    }

    public java.time.OffsetDateTime getOffsetDateTime(int r1, java.time.OffsetDateTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.OffsetDateTime
            if (r2 == 0) goto Le
            java.time.OffsetDateTime r1 = (java.time.OffsetDateTime) r1
            return r1
        Le:
            java.lang.Class<java.time.OffsetDateTime> r2 = java.time.OffsetDateTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.OffsetDateTime r1 = (java.time.OffsetDateTime) r1
            return r1
    }

    public java.time.OffsetTime getOffsetTime(int r2) {
            r1 = this;
            r0 = 0
            java.time.OffsetTime r2 = r1.getOffsetTime(r2, r0)
            return r2
    }

    public java.time.OffsetTime getOffsetTime(int r1, java.time.OffsetTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.OffsetTime
            if (r2 == 0) goto Le
            java.time.OffsetTime r1 = (java.time.OffsetTime) r1
            return r1
        Le:
            java.lang.Class<java.time.OffsetTime> r2 = java.time.OffsetTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.OffsetTime r1 = (java.time.OffsetTime) r1
            return r1
    }

    public java.lang.Short getShort(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Short
            if (r1 == 0) goto Lf
            java.lang.Short r3 = (java.lang.Short) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L3c
        L33:
            short r3 = java.lang.Short.parseShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to short"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public short getShortValue(int r1) {
            r0 = this;
            java.lang.Short r1 = r0.getShort(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            short r1 = r1.shortValue()
            return r1
    }

    public java.lang.String getString(int r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r0)
            return r2
    }

    public java.lang.String getString(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L7
            return r4
        L7:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto Le
            java.lang.String r3 = (java.lang.String) r3
            return r3
        Le:
            boolean r4 = r3 instanceof java.util.Date
            if (r4 == 0) goto L20
            java.util.Date r3 = (java.util.Date) r3
            long r3 = r3.getTime()
            r0 = 0
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r3 = com.alibaba.fastjson2.util.DateUtils.toString(r3, r0, r1)
            return r3
        L20:
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.lang.Character
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.util.UUID
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.lang.Enum
            if (r4 == 0) goto L35
            goto L3a
        L35:
            java.lang.String r3 = com.alibaba.fastjson2.JSON.toJSONString(r3)
            return r3
        L3a:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.time.ZonedDateTime getZonedDateTime(int r2) {
            r1 = this;
            r0 = 0
            java.time.ZonedDateTime r2 = r1.getZonedDateTime(r2, r0)
            return r2
    }

    public java.time.ZonedDateTime getZonedDateTime(int r1, java.time.ZonedDateTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.ZonedDateTime
            if (r2 == 0) goto Le
            java.time.ZonedDateTime r1 = (java.time.ZonedDateTime) r1
            return r1
        Le:
            java.lang.Class<java.time.ZonedDateTime> r2 = java.time.ZonedDateTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.ZonedDateTime r1 = (java.time.ZonedDateTime) r1
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object set(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = super.size()
            r1 = 0
            if (r4 >= 0) goto L14
            int r4 = r4 + r0
            if (r4 >= 0) goto Lf
            r4 = 0
            super.add(r4, r5)
            return r1
        Lf:
            java.lang.Object r4 = super.set(r4, r5)
            return r4
        L14:
            if (r4 >= r0) goto L1b
            java.lang.Object r4 = super.set(r4, r5)
            return r4
        L1b:
            int r2 = r0 + 4096
            if (r4 >= r2) goto L2b
        L1f:
            int r2 = r4 + (-1)
            if (r4 == r0) goto L28
            super.add(r1)
            r4 = r2
            goto L1f
        L28:
            super.add(r5)
        L2b:
            return r1
    }

    public <T> T to(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L9
            java.lang.String r2 = r1.toString()
            return r2
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r2)
            java.lang.Object r2 = r2.createInstance(r1)
            return r2
    }

    public <T> T to(java.lang.reflect.Type r3) {
            r2 = this;
            r0 = 0
            java.lang.Object r3 = r2.to(r3, r0)
            return r3
    }

    public <T> T to(java.lang.reflect.Type r2, long r3) {
            r1 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L9
            java.lang.String r2 = r1.toString()
            return r2
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r2)
            java.lang.Object r2 = r2.createInstance(r1, r3)
            return r2
    }

    public <T> T[] toArray(java.lang.Class<T> r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            r9 = this;
            int r0 = r11.length
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
        L6:
            if (r4 >= r0) goto L15
            r6 = r11[r4]
            long r7 = r6.mask
            long r2 = r2 | r7
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r6 != r7) goto L12
            r5 = 1
        L12:
            int r4 = r4 + 1
            goto L6
        L15:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r11 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r0 = r11.getObjectReader(r10, r5)
            int r4 = r9.size()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r10, r4)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L25:
            int r5 = r9.size()
            if (r1 >= r5) goto L7e
            java.lang.Object r5 = r9.get(r1)
            boolean r6 = r5 instanceof com.alibaba.fastjson2.JSONObject
            if (r6 == 0) goto L3a
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.createInstance(r5, r2)
            goto L79
        L3a:
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L45
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.createInstance(r5, r2)
            goto L79
        L45:
            if (r5 == 0) goto L79
            boolean r6 = r10.isInstance(r5)
            if (r6 == 0) goto L4e
            goto L79
        L4e:
            java.lang.Class r6 = r5.getClass()
            java.util.function.Function r7 = r11.getTypeConvert(r6, r10)
            if (r7 == 0) goto L5f
            java.lang.Object r5 = r7.apply(r5)
            r4[r1] = r5
            goto L7b
        L5f:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = " cannot be converted to "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L79:
            r4[r1] = r5
        L7b:
            int r1 = r1 + 1
            goto L25
        L7e:
            return r4
    }

    public byte[] toJSONBBytes(com.alibaba.fastjson2.JSONWriter.Feature... r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.ofJSONB(r2)
            r2.setRootObject(r1)     // Catch: java.lang.Throwable -> L12
            r2.write(r1)     // Catch: java.lang.Throwable -> L12
            byte[] r0 = r2.getBytes()     // Catch: java.lang.Throwable -> L12
            r2.close()
            return r0
        L12:
            r0 = move-exception
            if (r2 == 0) goto L1d
            r2.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r2 = move-exception
            r0.addSuppressed(r2)
        L1d:
            throw r0
    }

    public java.lang.String toJSONString(com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            r0 = this;
            java.lang.String r1 = r0.toString(r1)
            return r1
    }

    public <T> java.util.List<T> toJavaList(java.lang.Class<T> r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            r0 = this;
            java.util.List r1 = r0.toList(r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public <T> T toJavaObject(java.lang.reflect.Type r1) {
            r0 = this;
            java.lang.Object r1 = r0.to(r1)
            return r1
    }

    public <T> java.util.List<T> toList(java.lang.Class<T> r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            r9 = this;
            int r0 = r11.length
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
        L6:
            if (r4 >= r0) goto L15
            r6 = r11[r4]
            long r7 = r6.mask
            long r2 = r2 | r7
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r6 != r7) goto L12
            r5 = 1
        L12:
            int r4 = r4 + 1
            goto L6
        L15:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r11 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r0 = r11.getObjectReader(r10, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r9.size()
            r4.<init>(r5)
        L24:
            int r5 = r9.size()
            if (r1 >= r5) goto L7f
            java.lang.Object r5 = r9.get(r1)
            boolean r6 = r5 instanceof com.alibaba.fastjson2.JSONObject
            if (r6 == 0) goto L39
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.createInstance(r5, r2)
            goto L79
        L39:
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L44
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.createInstance(r5, r2)
            goto L79
        L44:
            if (r5 == 0) goto L79
            boolean r6 = r10.isInstance(r5)
            if (r6 == 0) goto L4d
            goto L79
        L4d:
            java.lang.Class r6 = r5.getClass()
            java.util.function.Function r7 = r11.getTypeConvert(r6, r10)
            if (r7 == 0) goto L5f
            java.lang.Object r5 = r7.apply(r5)
            r4.add(r5)
            goto L7c
        L5f:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = " cannot be converted to "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L79:
            r4.add(r5)
        L7c:
            int r1 = r1 + 1
            goto L24
        L7f:
            return r4
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter r0 = com.alibaba.fastjson2.JSONWriter.of()
            r0.setRootObject(r2)     // Catch: java.lang.Throwable -> L12
            r0.write(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r0.close()
            return r1
        L12:
            r1 = move-exception
            if (r0 == 0) goto L1d
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r1.addSuppressed(r0)
        L1d:
            throw r1
    }

    public java.lang.String toString(com.alibaba.fastjson2.JSONWriter.Feature... r9) {
            r8 = this;
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r0 = com.alibaba.fastjson2.JSONArray.class
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.of(r9)
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection     // Catch: java.lang.Throwable -> L28
            long r3 = r9.mask     // Catch: java.lang.Throwable -> L28
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat     // Catch: java.lang.Throwable -> L28
            long r5 = r9.mask     // Catch: java.lang.Throwable -> L28
            long r3 = r3 | r5
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray     // Catch: java.lang.Throwable -> L28
            long r5 = r9.mask     // Catch: java.lang.Throwable -> L28
            long r3 = r3 | r5
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue     // Catch: java.lang.Throwable -> L28
            long r5 = r9.mask     // Catch: java.lang.Throwable -> L28
            long r3 = r3 | r5
            com.alibaba.fastjson2.JSONWriter$Context r9 = r2.context     // Catch: java.lang.Throwable -> L28
            long r5 = r9.features     // Catch: java.lang.Throwable -> L28
            long r3 = r3 & r5
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L2b
            r2.write(r8)     // Catch: java.lang.Throwable -> L28
            goto L42
        L28:
            r0 = move-exception
            r9 = r0
            goto L4a
        L2b:
            r2.setRootObject(r8)     // Catch: java.lang.Throwable -> L28
            com.alibaba.fastjson2.writer.ObjectWriter<com.alibaba.fastjson2.JSONArray> r9 = com.alibaba.fastjson2.JSONArray.arrayWriter     // Catch: java.lang.Throwable -> L28
            if (r9 != 0) goto L38
            com.alibaba.fastjson2.writer.ObjectWriter r9 = r2.getObjectWriter(r0, r0)     // Catch: java.lang.Throwable -> L28
            com.alibaba.fastjson2.JSONArray.arrayWriter = r9     // Catch: java.lang.Throwable -> L28
        L38:
            com.alibaba.fastjson2.writer.ObjectWriter<com.alibaba.fastjson2.JSONArray> r1 = com.alibaba.fastjson2.JSONArray.arrayWriter     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r6 = 0
            r4 = 0
            r3 = r8
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L28
        L42:
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L28
            r2.close()
            return r9
        L4a:
            if (r2 == 0) goto L54
            r2.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r9.addSuppressed(r0)
        L54:
            throw r9
    }
}
