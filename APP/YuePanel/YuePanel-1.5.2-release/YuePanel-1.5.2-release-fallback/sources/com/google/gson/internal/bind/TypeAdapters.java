package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAdapters {
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> ATOMIC_BOOLEAN = null;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> ATOMIC_INTEGER = null;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> ATOMIC_INTEGER_ARRAY = null;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY = null;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.math.BigDecimal> BIG_DECIMAL = null;
    public static final com.google.gson.TypeAdapterFactory BIG_DECIMAL_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.math.BigInteger> BIG_INTEGER = null;
    public static final com.google.gson.TypeAdapterFactory BIG_INTEGER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.BitSet> BIT_SET = null;
    public static final com.google.gson.TypeAdapterFactory BIT_SET_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN = null;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN_AS_STRING = null;
    public static final com.google.gson.TypeAdapterFactory BOOLEAN_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> BYTE = null;
    public static final com.google.gson.TypeAdapterFactory BYTE_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.Calendar> CALENDAR = null;
    public static final com.google.gson.TypeAdapterFactory CALENDAR_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Character> CHARACTER = null;
    public static final com.google.gson.TypeAdapterFactory CHARACTER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Class> CLASS = null;
    public static final com.google.gson.TypeAdapterFactory CLASS_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.Currency> CURRENCY = null;
    public static final com.google.gson.TypeAdapterFactory CURRENCY_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> DOUBLE = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> DOUBLE_STRICT = null;
    public static final com.google.gson.TypeAdapterFactory ENUM_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> FLOAT = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> FLOAT_STRICT = null;
    public static final com.google.gson.TypeAdapter<java.net.InetAddress> INET_ADDRESS = null;
    public static final com.google.gson.TypeAdapterFactory INET_ADDRESS_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> INTEGER = null;
    public static final com.google.gson.TypeAdapterFactory INTEGER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<com.google.gson.JsonElement> JSON_ELEMENT = null;
    public static final com.google.gson.TypeAdapterFactory JSON_ELEMENT_FACTORY = null;
    public static final com.google.gson.TypeAdapter<com.google.gson.internal.LazilyParsedNumber> LAZILY_PARSED_NUMBER = null;
    public static final com.google.gson.TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.Locale> LOCALE = null;
    public static final com.google.gson.TypeAdapterFactory LOCALE_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> LONG = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> LONG_AS_STRING = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> SHORT = null;
    public static final com.google.gson.TypeAdapterFactory SHORT_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.String> STRING = null;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuffer> STRING_BUFFER = null;
    public static final com.google.gson.TypeAdapterFactory STRING_BUFFER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuilder> STRING_BUILDER = null;
    public static final com.google.gson.TypeAdapterFactory STRING_BUILDER_FACTORY = null;
    public static final com.google.gson.TypeAdapterFactory STRING_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.net.URI> URI = null;
    public static final com.google.gson.TypeAdapterFactory URI_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.net.URL> URL = null;
    public static final com.google.gson.TypeAdapterFactory URL_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.UUID> UUID = null;
    public static final com.google.gson.TypeAdapterFactory UUID_FACTORY = null;




























    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$34, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass34 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }







    public static class DoubleAdapter extends com.google.gson.TypeAdapter<java.lang.Number> {
        private final boolean strict;

        public DoubleAdapter(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.strict = r1
                return
        }

        @Override // com.google.gson.TypeAdapter
        public java.lang.Number read(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
                r2 = this;
                com.google.gson.stream.JsonToken r0 = r3.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r3.nextNull()
                r3 = 0
                return r3
            Ld:
                double r0 = r3.nextDouble()
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
                return r3
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ java.lang.Number read2(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                java.lang.Double r1 = r0.read(r1)
                return r1
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(com.google.gson.stream.JsonWriter r3, java.lang.Number r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L6
                r3.nullValue()
                return
            L6:
                double r0 = r4.doubleValue()
                boolean r4 = r2.strict
                if (r4 == 0) goto L11
                com.google.gson.internal.bind.TypeAdapters.access$000(r0)
            L11:
                r3.value(r0)
                return
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Number r2) throws java.io.IOException {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r0.write2(r1, r2)
                return
        }
    }

    public interface FactorySupplier {
        com.google.gson.TypeAdapterFactory get();
    }

    public static class FloatAdapter extends com.google.gson.TypeAdapter<java.lang.Number> {
        private final boolean strict;

        public FloatAdapter(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.strict = r1
                return
        }

        @Override // com.google.gson.TypeAdapter
        public java.lang.Number read(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
                r2 = this;
                com.google.gson.stream.JsonToken r0 = r3.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r3.nextNull()
                r3 = 0
                return r3
            Ld:
                double r0 = r3.nextDouble()
                float r3 = (float) r0
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                return r3
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ java.lang.Number read2(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                java.lang.Float r1 = r0.read(r1)
                return r1
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(com.google.gson.stream.JsonWriter r4, java.lang.Number r5) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L6
                r4.nullValue()
                return
            L6:
                float r0 = r5.floatValue()
                boolean r1 = r3.strict
                if (r1 == 0) goto L12
                double r1 = (double) r0
                com.google.gson.internal.bind.TypeAdapters.access$000(r1)
            L12:
                boolean r1 = r5 instanceof java.lang.Float
                if (r1 == 0) goto L17
                goto L1b
            L17:
                java.lang.Float r5 = java.lang.Float.valueOf(r0)
            L1b:
                r4.value(r5)
                return
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Number r2) throws java.io.IOException {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r0.write2(r1, r2)
                return
        }
    }

    public static abstract class IntegerFieldsTypeAdapter<T> extends com.google.gson.TypeAdapter<T> {
        private final java.util.List<java.lang.String> fields;

        public IntegerFieldsTypeAdapter(java.lang.String... r1) {
                r0 = this;
                r0.<init>()
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.fields = r1
                return
        }

        public abstract T create(long[] r1);

        public abstract long[] integerValues(T r1);

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
                r4 = this;
                com.google.gson.stream.JsonToken r0 = r5.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r5.nextNull()
                r5 = 0
                return r5
            Ld:
                r5.beginObject()
                java.util.List<java.lang.String> r0 = r4.fields
                int r0 = r0.size()
                long[] r0 = new long[r0]
            L18:
                com.google.gson.stream.JsonToken r1 = r5.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.END_OBJECT
                if (r1 == r2) goto L37
                java.lang.String r1 = r5.nextName()
                java.util.List<java.lang.String> r2 = r4.fields
                int r1 = r2.indexOf(r1)
                if (r1 < 0) goto L33
                long r2 = r5.nextLong()
                r0[r1] = r2
                goto L18
            L33:
                r5.skipValue()
                goto L18
            L37:
                r5.endObject()
                java.lang.Object r5 = r4.create(r0)
                return r5
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r4, T r5) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L6
                r4.nullValue()
                return
            L6:
                r4.beginObject()
                long[] r5 = r3.integerValues(r5)
                r0 = 0
            Le:
                java.util.List<java.lang.String> r1 = r3.fields
                int r1 = r1.size()
                if (r0 >= r1) goto L29
                java.util.List<java.lang.String> r1 = r3.fields
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                r4.name(r1)
                r1 = r5[r0]
                r4.value(r1)
                int r0 = r0 + 1
                goto Le
            L29:
                r4.endObject()
                return
        }
    }

    static {
            com.google.gson.internal.bind.TypeAdapters$1 r0 = new com.google.gson.internal.bind.TypeAdapters$1
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.CLASS = r0
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.CLASS_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$2 r0 = new com.google.gson.internal.bind.TypeAdapters$2
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.BIT_SET = r0
            java.lang.Class<java.util.BitSet> r1 = java.util.BitSet.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$3 r0 = new com.google.gson.internal.bind.TypeAdapters$3
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.BOOLEAN = r0
            com.google.gson.internal.bind.TypeAdapters$4 r1 = new com.google.gson.internal.bind.TypeAdapters$4
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$5 r0 = new com.google.gson.internal.bind.TypeAdapters$5
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.BYTE = r0
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$6 r0 = new com.google.gson.internal.bind.TypeAdapters$6
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.SHORT = r0
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$7 r0 = new com.google.gson.internal.bind.TypeAdapters$7
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.INTEGER = r0
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$8 r0 = new com.google.gson.internal.bind.TypeAdapters$8
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER = r0
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$10 r0 = new com.google.gson.internal.bind.TypeAdapters$10
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN = r0
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r1 = java.util.concurrent.atomic.AtomicBoolean.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$11 r0 = new com.google.gson.internal.bind.TypeAdapters$11
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY = r0
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r1 = java.util.concurrent.atomic.AtomicIntegerArray.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$13 r0 = new com.google.gson.internal.bind.TypeAdapters$13
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.LONG = r0
            com.google.gson.internal.bind.TypeAdapters$14 r0 = new com.google.gson.internal.bind.TypeAdapters$14
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.LONG_AS_STRING = r0
            com.google.gson.internal.bind.TypeAdapters$FloatAdapter r0 = new com.google.gson.internal.bind.TypeAdapters$FloatAdapter
            r1 = 0
            r0.<init>(r1)
            com.google.gson.internal.bind.TypeAdapters.FLOAT = r0
            com.google.gson.internal.bind.TypeAdapters$FloatAdapter r0 = new com.google.gson.internal.bind.TypeAdapters$FloatAdapter
            r2 = 1
            r0.<init>(r2)
            com.google.gson.internal.bind.TypeAdapters.FLOAT_STRICT = r0
            com.google.gson.internal.bind.TypeAdapters$DoubleAdapter r0 = new com.google.gson.internal.bind.TypeAdapters$DoubleAdapter
            r0.<init>(r1)
            com.google.gson.internal.bind.TypeAdapters.DOUBLE = r0
            com.google.gson.internal.bind.TypeAdapters$DoubleAdapter r0 = new com.google.gson.internal.bind.TypeAdapters$DoubleAdapter
            r0.<init>(r2)
            com.google.gson.internal.bind.TypeAdapters.DOUBLE_STRICT = r0
            com.google.gson.internal.bind.TypeAdapters$15 r0 = new com.google.gson.internal.bind.TypeAdapters$15
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.CHARACTER = r0
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$16 r0 = new com.google.gson.internal.bind.TypeAdapters$16
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.STRING = r0
            com.google.gson.internal.bind.TypeAdapters$17 r1 = new com.google.gson.internal.bind.TypeAdapters$17
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL = r1
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            com.google.gson.TypeAdapterFactory r1 = newFactory(r2, r1)
            com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL_FACTORY = r1
            com.google.gson.internal.bind.TypeAdapters$18 r1 = new com.google.gson.internal.bind.TypeAdapters$18
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER = r1
            java.lang.Class<java.math.BigInteger> r2 = java.math.BigInteger.class
            com.google.gson.TypeAdapterFactory r1 = newFactory(r2, r1)
            com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER_FACTORY = r1
            com.google.gson.internal.bind.TypeAdapters$19 r1 = new com.google.gson.internal.bind.TypeAdapters$19
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapters.LAZILY_PARSED_NUMBER = r1
            java.lang.Class<com.google.gson.internal.LazilyParsedNumber> r2 = com.google.gson.internal.LazilyParsedNumber.class
            com.google.gson.TypeAdapterFactory r1 = newFactory(r2, r1)
            com.google.gson.internal.bind.TypeAdapters.LAZILY_PARSED_NUMBER_FACTORY = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.STRING_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$20 r0 = new com.google.gson.internal.bind.TypeAdapters$20
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER = r0
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$21 r0 = new com.google.gson.internal.bind.TypeAdapters$21
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER = r0
            java.lang.Class<java.lang.StringBuffer> r1 = java.lang.StringBuffer.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$22 r0 = new com.google.gson.internal.bind.TypeAdapters$22
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.URL = r0
            java.lang.Class<java.net.URL> r1 = java.net.URL.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.URL_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$23 r0 = new com.google.gson.internal.bind.TypeAdapters$23
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.URI = r0
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.URI_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$24 r0 = new com.google.gson.internal.bind.TypeAdapters$24
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS = r0
            java.lang.Class<java.net.InetAddress> r1 = java.net.InetAddress.class
            com.google.gson.TypeAdapterFactory r0 = newTypeHierarchyFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$25 r0 = new com.google.gson.internal.bind.TypeAdapters$25
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.UUID = r0
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.UUID_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$26 r0 = new com.google.gson.internal.bind.TypeAdapters$26
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.CURRENCY = r0
            java.lang.Class<java.util.Currency> r1 = java.util.Currency.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$27 r0 = new com.google.gson.internal.bind.TypeAdapters$27
            java.lang.String r5 = "minute"
            java.lang.String r6 = "second"
            java.lang.String r1 = "year"
            java.lang.String r2 = "month"
            java.lang.String r3 = "dayOfMonth"
            java.lang.String r4 = "hourOfDay"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            r0.<init>(r1)
            com.google.gson.internal.bind.TypeAdapters.CALENDAR = r0
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            java.lang.Class<java.util.GregorianCalendar> r2 = java.util.GregorianCalendar.class
            com.google.gson.TypeAdapterFactory r0 = newFactoryForMultipleTypes(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$28 r0 = new com.google.gson.internal.bind.TypeAdapters$28
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.LOCALE = r0
            java.lang.Class<java.util.Locale> r1 = java.util.Locale.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY = r0
            com.google.gson.internal.bind.JsonElementTypeAdapter r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.ADAPTER
            com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT = r0
            java.lang.Class<com.google.gson.JsonElement> r1 = com.google.gson.JsonElement.class
            com.google.gson.TypeAdapterFactory r0 = newTypeHierarchyFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY = r0
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.EnumTypeAdapter.FACTORY
            com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY = r0
            return
    }

    private TypeAdapters() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void access$000(double r0) {
            checkValidFloatingPoint(r0)
            return
    }

    public static /* synthetic */ int access$100(long r0) {
            int r0 = toIntExact(r0)
            return r0
    }

    public static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLong> atomicLongAdapter(com.google.gson.TypeAdapter<java.lang.Number> r1) {
            java.util.Objects.requireNonNull(r1)
            com.google.gson.internal.bind.TypeAdapters$9 r0 = new com.google.gson.internal.bind.TypeAdapters$9
            r0.<init>(r1)
            com.google.gson.TypeAdapter r1 = r0.nullSafe()
            return r1
    }

    public static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLongArray> atomicLongArrayAdapter(com.google.gson.TypeAdapter<java.lang.Number> r1) {
            java.util.Objects.requireNonNull(r1)
            com.google.gson.internal.bind.TypeAdapters$12 r0 = new com.google.gson.internal.bind.TypeAdapters$12
            r0.<init>(r1)
            com.google.gson.TypeAdapter r1 = r0.nullSafe()
            return r1
    }

    private static void checkValidFloatingPoint(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto Ld
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static com.google.gson.TypeAdapterFactory javaTimeTypeAdapterFactory() {
            r0 = 0
            java.lang.String r1 = "com.google.gson.internal.bind.JavaTimeTypeAdapters"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L15
            com.google.gson.internal.bind.TypeAdapters$FactorySupplier r1 = (com.google.gson.internal.bind.TypeAdapters.FactorySupplier) r1     // Catch: java.lang.Throwable -> L15
            com.google.gson.TypeAdapterFactory r0 = r1.get()     // Catch: java.lang.Throwable -> L15
        L15:
            return r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(com.google.gson.reflect.TypeToken<TT> r1, com.google.gson.TypeAdapter<TT> r2) {
            com.google.gson.internal.bind.TypeAdapters$29 r0 = new com.google.gson.internal.bind.TypeAdapters$29
            r0.<init>(r1, r2)
            return r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(java.lang.Class<TT> r1, com.google.gson.TypeAdapter<TT> r2) {
            com.google.gson.internal.bind.TypeAdapters$30 r0 = new com.google.gson.internal.bind.TypeAdapters$30
            r0.<init>(r1, r2)
            return r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(java.lang.Class<TT> r1, java.lang.Class<TT> r2, com.google.gson.TypeAdapter<? super TT> r3) {
            com.google.gson.internal.bind.TypeAdapters$31 r0 = new com.google.gson.internal.bind.TypeAdapters$31
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactoryForMultipleTypes(java.lang.Class<TT> r1, java.lang.Class<? extends TT> r2, com.google.gson.TypeAdapter<? super TT> r3) {
            com.google.gson.internal.bind.TypeAdapters$32 r0 = new com.google.gson.internal.bind.TypeAdapters$32
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T1> com.google.gson.TypeAdapterFactory newTypeHierarchyFactory(java.lang.Class<T1> r1, com.google.gson.TypeAdapter<T1> r2) {
            com.google.gson.internal.bind.TypeAdapters$33 r0 = new com.google.gson.internal.bind.TypeAdapters$33
            r0.<init>(r1, r2)
            return r0
    }

    private static int toIntExact(long r3) {
            int r0 = (int) r3
            long r1 = (long) r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Too big for an int: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
