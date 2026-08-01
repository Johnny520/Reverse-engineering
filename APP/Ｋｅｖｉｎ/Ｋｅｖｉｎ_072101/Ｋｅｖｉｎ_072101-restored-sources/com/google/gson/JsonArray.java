package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonArray extends com.google.gson.JsonElement implements java.lang.Iterable<com.google.gson.JsonElement> {
    private final java.util.ArrayList<com.google.gson.JsonElement> elements;

    public JsonArray() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.elements = r0
            return
    }

    public JsonArray(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.elements = r0
            return
    }

    private com.google.gson.JsonElement getAsSingleElement() {
            r4 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r4.elements
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L13
            java.util.ArrayList<com.google.gson.JsonElement> r1 = r4.elements
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            return r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Array must have size 1, but has size "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void add(com.google.gson.JsonElement r2) {
            r1 = this;
            if (r2 != 0) goto L4
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
        L4:
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            r0.add(r2)
            return
    }

    public void add(java.lang.Boolean r3) {
            r2 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r2.elements
            if (r3 != 0) goto L7
            com.google.gson.JsonNull r1 = com.google.gson.JsonNull.INSTANCE
            goto Lc
        L7:
            com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
            r1.<init>(r3)
        Lc:
            r0.add(r1)
            return
    }

    public void add(java.lang.Character r3) {
            r2 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r2.elements
            if (r3 != 0) goto L7
            com.google.gson.JsonNull r1 = com.google.gson.JsonNull.INSTANCE
            goto Lc
        L7:
            com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
            r1.<init>(r3)
        Lc:
            r0.add(r1)
            return
    }

    public void add(java.lang.Number r3) {
            r2 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r2.elements
            if (r3 != 0) goto L7
            com.google.gson.JsonNull r1 = com.google.gson.JsonNull.INSTANCE
            goto Lc
        L7:
            com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
            r1.<init>(r3)
        Lc:
            r0.add(r1)
            return
    }

    public void add(java.lang.String r3) {
            r2 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r2.elements
            if (r3 != 0) goto L7
            com.google.gson.JsonNull r1 = com.google.gson.JsonNull.INSTANCE
            goto Lc
        L7:
            com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
            r1.<init>(r3)
        Lc:
            r0.add(r1)
            return
    }

    public void addAll(com.google.gson.JsonArray r3) {
            r2 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r2.elements
            java.util.ArrayList<com.google.gson.JsonElement> r1 = r3.elements
            r0.addAll(r1)
            return
    }

    public java.util.List<com.google.gson.JsonElement> asList() {
            r2 = this;
            com.google.gson.internal.NonNullElementWrapperList r0 = new com.google.gson.internal.NonNullElementWrapperList
            java.util.ArrayList<com.google.gson.JsonElement> r1 = r2.elements
            r0.<init>(r1)
            return r0
    }

    public boolean contains(com.google.gson.JsonElement r2) {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            boolean r0 = r0.contains(r2)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public com.google.gson.JsonArray deepCopy() {
            r4 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r4.elements
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
            java.util.ArrayList<com.google.gson.JsonElement> r1 = r4.elements
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.ArrayList<com.google.gson.JsonElement> r1 = r4.elements
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
            com.google.gson.JsonElement r3 = r2.deepCopy()
            r0.add(r3)
            goto L19
        L2d:
            return r0
        L2e:
            com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
            r0.<init>()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement deepCopy() {
            r1 = this;
            com.google.gson.JsonArray r0 = r1.deepCopy()
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L16
            boolean r0 = r3 instanceof com.google.gson.JsonArray
            if (r0 == 0) goto L14
            r0 = r3
            com.google.gson.JsonArray r0 = (com.google.gson.JsonArray) r0
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r0.elements
            java.util.ArrayList<com.google.gson.JsonElement> r1 = r2.elements
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            return r0
    }

    public com.google.gson.JsonElement get(int r2) {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            java.lang.Object r0 = r0.get(r2)
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.math.BigDecimal getAsBigDecimal() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            java.math.BigDecimal r0 = r0.getAsBigDecimal()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.math.BigInteger getAsBigInteger() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            java.math.BigInteger r0 = r0.getAsBigInteger()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            boolean r0 = r0.getAsBoolean()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            byte r0 = r0.getAsByte()
            return r0
    }

    @Override // com.google.gson.JsonElement
    @java.lang.Deprecated
    public char getAsCharacter() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            char r0 = r0.getAsCharacter()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
            r2 = this;
            com.google.gson.JsonElement r0 = r2.getAsSingleElement()
            double r0 = r0.getAsDouble()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            float r0 = r0.getAsFloat()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            int r0 = r0.getAsInt()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
            r2 = this;
            com.google.gson.JsonElement r0 = r2.getAsSingleElement()
            long r0 = r0.getAsLong()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.lang.Number getAsNumber() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            java.lang.Number r0 = r0.getAsNumber()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            short r0 = r0.getAsShort()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.lang.String getAsString() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.getAsSingleElement()
            java.lang.String r0 = r0.getAsString()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.google.gson.JsonElement> iterator() {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public com.google.gson.JsonElement remove(int r2) {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            java.lang.Object r0 = r0.remove(r2)
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            return r0
    }

    public boolean remove(com.google.gson.JsonElement r2) {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            boolean r0 = r0.remove(r2)
            return r0
    }

    public com.google.gson.JsonElement set(int r3, com.google.gson.JsonElement r4) {
            r2 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r2.elements
            if (r4 != 0) goto L7
            com.google.gson.JsonNull r1 = com.google.gson.JsonNull.INSTANCE
            goto L8
        L7:
            r1 = r4
        L8:
            java.lang.Object r0 = r0.set(r3, r1)
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            return r0
    }

    public int size() {
            r1 = this;
            java.util.ArrayList<com.google.gson.JsonElement> r0 = r1.elements
            int r0 = r0.size()
            return r0
    }
}
