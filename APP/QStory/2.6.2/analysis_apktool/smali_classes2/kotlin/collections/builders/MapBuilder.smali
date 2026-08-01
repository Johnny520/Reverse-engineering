.class public final Lkotlin/collections/builders/MapBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世兰苏哲;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map<",
        "TK;TV;>;",
        "Ljava/io/Serializable;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u82cf\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010&\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008&\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010#\n\u0002\u0008\u0003\n\u0002\u0010\u001f\n\u0002\u0008\u0003\n\u0002\u0010\'\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 \u0097\u0001*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\t\u0098\u0001\u0099\u0001GKO\u009a\u0001BG\u0008\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0011B\u0011\u0008\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0013J\u0019\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u001a\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J%\u0010%\u001a\u00020$2\u0014\u0010#\u001a\u0010\u0012\u0006\u0008\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0019\u0010\'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\'\u0010 J\u000f\u0010(\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008(\u0010\u0011J\u001a\u0010+\u001a\u00020\u00172\u0008\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002\u00a2\u0006\u0004\u0008+\u0010\u001cJ\u000f\u0010,\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00102\u001a\u00020$H\u0000\u00a2\u0006\u0004\u00081\u0010\u0011J\u0017\u00105\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\u00083\u00104J\u0017\u00107\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\u00086\u0010\u001cJ#\u0010<\u001a\u00020\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000\u00a2\u0006\u0004\u0008:\u0010;J\u001b\u0010A\u001a\u00020\u00172\n\u0010>\u001a\u0006\u0012\u0002\u0008\u00030=H\u0000\u00a2\u0006\u0004\u0008?\u0010@J#\u0010C\u001a\u00020\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000\u00a2\u0006\u0004\u0008B\u0010;J\u0017\u0010F\u001a\u00020\u00172\u0006\u0010D\u001a\u00028\u0001H\u0000\u00a2\u0006\u0004\u0008E\u0010\u001cJ\u001b\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000\u00a2\u0006\u0004\u0008H\u0010IJ\u001b\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010KH\u0000\u00a2\u0006\u0004\u0008L\u0010MJ\u001b\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010OH\u0000\u00a2\u0006\u0004\u0008P\u0010QJ\u000f\u0010S\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008S\u0010TJ\u0017\u0010W\u001a\u00020$2\u0006\u0010V\u001a\u00020UH\u0002\u00a2\u0006\u0004\u0008W\u0010XJ\u000f\u0010Y\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008Y\u0010\u0011J\u0017\u0010[\u001a\u00020$2\u0006\u0010Z\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008[\u0010\u0013J\u0017\u0010]\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008]\u0010^J\u0017\u0010`\u001a\u00020$2\u0006\u0010_\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008`\u0010\u0013J\u0015\u0010a\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008a\u0010bJ\u0017\u0010c\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008c\u00104J\u0017\u0010e\u001a\u00020$2\u0006\u0010d\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008e\u0010fJ\u0017\u0010h\u001a\u00020$2\u0006\u0010g\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008h\u0010\u0013J\u0017\u0010j\u001a\u00020\u00172\u0006\u0010i\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008j\u0010^J\u0017\u0010k\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008k\u00104J\u0017\u0010l\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\u0008l\u00104J\u0017\u0010n\u001a\u00020$2\u0006\u0010m\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008n\u0010\u0013J\u0017\u0010p\u001a\u00020$2\u0006\u0010o\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008p\u0010\u0013J\u001f\u0010q\u001a\u00020\u00172\u000e\u0010*\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0014H\u0002\u00a2\u0006\u0004\u0008q\u0010rJ#\u0010s\u001a\u00020\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0002\u00a2\u0006\u0004\u0008s\u0010;J)\u0010t\u001a\u00020\u00172\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001080=H\u0003\u00a2\u0006\u0004\u0008t\u0010@R\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010uR\u001e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010uR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010vR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010vR\u0016\u0010\r\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010wR\u0016\u0010\u000e\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010wR\u0016\u0010x\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010wR\u0016\u0010y\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008y\u0010wR$\u0010z\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u000c8\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008z\u0010w\u001a\u0004\u0008{\u0010-R\u001e\u0010}\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010|8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R!\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R(\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178\u0000@BX\u0080\u000e\u00a2\u0006\u000f\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001\u001a\u0005\u0008\u0087\u0001\u0010\u0019R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008c\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008d\u0001\u0010\u008e\u0001R+\u0010\u0092\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0090\u00010\u0088\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0091\u0001\u0010\u008a\u0001R\u0016\u0010\u0094\u0001\u001a\u00020\u000c8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0093\u0001\u0010-R\u0016\u0010\u0096\u0001\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0095\u0001\u0010-\u00a8\u0006\u009b\u0001"
    }
    d2 = {
        "Lkotlin/collections/builders/MapBuilder;",
        "K",
        "V",
        "",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "",
        "keysArray",
        "valuesArray",
        "",
        "presenceArray",
        "hashArray",
        "",
        "maxProbeDistance",
        "length",
        "<init>",
        "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V",
        "()V",
        "initialCapacity",
        "(I)V",
        "",
        "build",
        "()Ljava/util/Map;",
        "",
        "isEmpty",
        "()Z",
        "key",
        "containsKey",
        "(Ljava/lang/Object;)Z",
        "value",
        "containsValue",
        "get",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "put",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "from",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "putAll",
        "(Ljava/util/Map;)V",
        "remove",
        "clear",
        "",
        "other",
        "equals",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "checkIsMutable$kotlin_stdlib",
        "checkIsMutable",
        "addKey$kotlin_stdlib",
        "(Ljava/lang/Object;)I",
        "addKey",
        "removeKey$kotlin_stdlib",
        "removeKey",
        "",
        "entry",
        "containsEntry$kotlin_stdlib",
        "(Ljava/util/Map$Entry;)Z",
        "containsEntry",
        "",
        "m",
        "containsAllEntries$kotlin_stdlib",
        "(Ljava/util/Collection;)Z",
        "containsAllEntries",
        "removeEntry$kotlin_stdlib",
        "removeEntry",
        "element",
        "removeValue$kotlin_stdlib",
        "removeValue",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "keysIterator$kotlin_stdlib",
        "()Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "keysIterator",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
        "valuesIterator$kotlin_stdlib",
        "()Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
        "valuesIterator",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "entriesIterator$kotlin_stdlib",
        "()Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "entriesIterator",
        "writeReplace",
        "()Ljava/lang/Object;",
        "Ljava/io/ObjectInputStream;",
        "input",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "registerModification",
        "n",
        "ensureExtraCapacity",
        "extraCapacity",
        "shouldCompact",
        "(I)Z",
        "minCapacity",
        "ensureCapacity",
        "allocateValuesArray",
        "()[Ljava/lang/Object;",
        "hash",
        "updateHashArray",
        "compact",
        "(Z)V",
        "newHashSize",
        "rehash",
        "i",
        "putRehash",
        "findKey",
        "findValue",
        "index",
        "removeEntryAt",
        "removedHash",
        "removeHashAt",
        "contentEquals",
        "(Ljava/util/Map;)Z",
        "putEntry",
        "putAllEntries",
        "[Ljava/lang/Object;",
        "[I",
        "I",
        "hashShift",
        "modCount",
        "size",
        "getSize",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "keysView",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
        "valuesView",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "entriesView",
        "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "isReadOnly",
        "Z",
        "isReadOnly$kotlin_stdlib",
        "",
        "getKeys",
        "()Ljava/util/Set;",
        "keys",
        "",
        "getValues",
        "()Ljava/util/Collection;",
        "values",
        "",
        "getEntries",
        "entries",
        "getCapacity$kotlin_stdlib",
        "capacity",
        "getHashSize",
        "hashSize",
        "Companion",
        "kotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170",
        "androidx/core/view/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2",
        "kotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lkotlin/collections/builders/飘花落叶言子楪世哲苏兰;

.field private static final Empty:Lkotlin/collections/builders/MapBuilder;

.field private static final INITIAL_CAPACITY:I = 0x8

.field private static final INITIAL_MAX_PROBE_DISTANCE:I = 0x2

.field private static final MAGIC:I = -0x61c88647

.field private static final TOMBSTONE:I = -0x1


# instance fields
.field private entriesView:Lkotlin/collections/builders/飘花落叶言子楪苏世兰哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;"
        }
    .end annotation
.end field

.field private hashArray:[I

.field private hashShift:I

.field private isReadOnly:Z

.field private keysArray:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TK;"
        }
    .end annotation
.end field

.field private keysView:Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;"
        }
    .end annotation
.end field

.field private length:I

.field private maxProbeDistance:I

.field private modCount:I

.field private presenceArray:[I

.field private size:I

.field private valuesArray:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TV;"
        }
    .end annotation
.end field

.field private valuesView:Lkotlin/collections/builders/飘花落叶言子楪苏哲兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/collections/builders/MapBuilder;->Companion:Lkotlin/collections/builders/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    new-instance v0, Lkotlin/collections/builders/MapBuilder;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lkotlin/collections/builders/MapBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Lkotlin/collections/builders/MapBuilder;->isReadOnly:Z

    .line 16
    .line 17
    sput-object v0, Lkotlin/collections/builders/MapBuilder;->Empty:Lkotlin/collections/builders/MapBuilder;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    .line 39
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 7

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    new-array v1, p1, [Ljava/lang/Object;

    .line 4
    .line 5
    new-array v3, p1, [I

    .line 6
    .line 7
    sget-object v0, Lkotlin/collections/builders/MapBuilder;->Companion:Lkotlin/collections/builders/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    move p1, v0

    .line 16
    :cond_0
    mul-int/lit8 p1, p1, 0x3

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    new-array v4, p1, [I

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v6}, Lkotlin/collections/builders/MapBuilder;-><init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p0, "capacity must be non-negative."

    .line 33
    .line 34
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method private constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TK;[TV;[I[III)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 42
    iput-object p2, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 43
    iput-object p3, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 44
    iput-object p4, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 45
    iput p5, p0, Lkotlin/collections/builders/MapBuilder;->maxProbeDistance:I

    .line 46
    iput p6, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 47
    sget-object p1, Lkotlin/collections/builders/MapBuilder;->Companion:Lkotlin/collections/builders/飘花落叶言子楪世哲苏兰;

    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    move-result p2

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    invoke-static {p2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 50
    iput p1, p0, Lkotlin/collections/builders/MapBuilder;->hashShift:I

    return-void
.end method

.method public static final synthetic access$allocateValuesArray(Lkotlin/collections/builders/MapBuilder;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->allocateValuesArray()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getEmpty$cp()Lkotlin/collections/builders/MapBuilder;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/collections/builders/MapBuilder;->Empty:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getKeysArray$p(Lkotlin/collections/builders/MapBuilder;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLength$p(Lkotlin/collections/builders/MapBuilder;)I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getModCount$p(Lkotlin/collections/builders/MapBuilder;)I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/collections/builders/MapBuilder;->modCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getPresenceArray$p(Lkotlin/collections/builders/MapBuilder;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getValuesArray$p(Lkotlin/collections/builders/MapBuilder;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$removeEntryAt(Lkotlin/collections/builders/MapBuilder;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->removeEntryAt(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final allocateValuesArray()[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getCapacity$kotlin_stdlib()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ltz v0, :cond_1

    .line 11
    .line 12
    new-array v0, v0, [Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    const-string p0, "capacity must be non-negative."

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method private final compact(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget v3, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 6
    .line 7
    if-ge v1, v3, :cond_3

    .line 8
    .line 9
    iget-object v3, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 10
    .line 11
    aget v4, v3, v1

    .line 12
    .line 13
    if-ltz v4, :cond_2

    .line 14
    .line 15
    iget-object v5, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 16
    .line 17
    aget-object v6, v5, v1

    .line 18
    .line 19
    aput-object v6, v5, v2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    aget-object v5, v0, v1

    .line 24
    .line 25
    aput-object v5, v0, v2

    .line 26
    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    aput v4, v3, v2

    .line 30
    .line 31
    iget-object v3, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 32
    .line 33
    add-int/lit8 v5, v2, 0x1

    .line 34
    .line 35
    aput v5, v3, v4

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget-object p1, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1, v2, v3}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲([Ljava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iget p1, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 50
    .line 51
    invoke-static {v0, v2, p1}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲([Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    :cond_4
    iput v2, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 55
    .line 56
    return-void
.end method

.method private final contentEquals(Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lkotlin/collections/builders/MapBuilder;->containsAllEntries$kotlin_stdlib(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method private final ensureCapacity(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getCapacity$kotlin_stdlib()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-le p1, v0, :cond_2

    .line 8
    .line 9
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getCapacity$kotlin_stdlib()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    :goto_0
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 46
    .line 47
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 52
    .line 53
    sget-object v0, Lkotlin/collections/builders/MapBuilder;->Companion:Lkotlin/collections/builders/飘花落叶言子楪世哲苏兰;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    if-ge p1, v0, :cond_1

    .line 60
    .line 61
    move p1, v0

    .line 62
    :cond_1
    mul-int/lit8 p1, p1, 0x3

    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-le p1, v0, :cond_2

    .line 73
    .line 74
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->rehash(I)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void

    .line 78
    :cond_3
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method private final ensureExtraCapacity(I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->shouldCompact(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->compact(Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget v0, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 13
    .line 14
    add-int/2addr v0, p1

    .line 15
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->ensureCapacity(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final findKey(Ljava/lang/Object;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->hash(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lkotlin/collections/builders/MapBuilder;->maxProbeDistance:I

    .line 6
    .line 7
    :goto_0
    iget-object v2, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 8
    .line 9
    aget v2, v2, v0

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    iget-object v4, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 16
    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    aget-object v4, v4, v2

    .line 20
    .line 21
    invoke-static {v4, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    add-int/2addr v1, v3

    .line 29
    if-gez v1, :cond_2

    .line 30
    .line 31
    return v3

    .line 32
    :cond_2
    add-int/lit8 v2, v0, -0x1

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/lit8 v0, v0, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    move v0, v2

    .line 44
    goto :goto_0
.end method

.method private final findValue(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)I"
        }
    .end annotation

    .line 1
    iget v0, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 2
    .line 3
    :cond_0
    const/4 v1, -0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 8
    .line 9
    aget v1, v1, v0

    .line 10
    .line 11
    if-ltz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    aget-object v1, v1, v0

    .line 19
    .line 20
    invoke-static {v1, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1
    return v1
.end method

.method private final getHashSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method private final hash(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const v0, -0x61c88647

    .line 10
    .line 11
    .line 12
    mul-int/2addr p1, v0

    .line 13
    iget p0, p0, Lkotlin/collections/builders/MapBuilder;->hashShift:I

    .line 14
    .line 15
    ushr-int p0, p1, p0

    .line 16
    .line 17
    return p0
.end method

.method private final putAllEntries(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;>;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->ensureExtraCapacity(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->putEntry(Ljava/util/Map$Entry;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return v1
.end method

.method private final putEntry(Ljava/util/Map$Entry;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lkotlin/collections/builders/MapBuilder;->addKey$kotlin_stdlib(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->allocateValuesArray()[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    aput-object p1, p0, v0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    neg-int v0, v0

    .line 24
    sub-int/2addr v0, v1

    .line 25
    aget-object v2, p0, v0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    aput-object p1, p0, v0

    .line 42
    .line 43
    return v1

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method private final putRehash(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->hash(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lkotlin/collections/builders/MapBuilder;->maxProbeDistance:I

    .line 10
    .line 11
    :goto_0
    iget-object v2, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 12
    .line 13
    aget v3, v2, v0

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 v1, p1, 0x1

    .line 19
    .line 20
    aput v1, v2, v0

    .line 21
    .line 22
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 23
    .line 24
    aput v0, p0, p1

    .line 25
    .line 26
    return v4

    .line 27
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    if-gez v1, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_1
    add-int/lit8 v2, v0, -0x1

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sub-int/2addr v0, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v2

    .line 44
    goto :goto_0
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 2
    .line 3
    const-string p1, "Deserialization is supported via proxy only"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method private final registerModification()V
    .locals 1

    .line 1
    iget v0, p0, Lkotlin/collections/builders/MapBuilder;->modCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lkotlin/collections/builders/MapBuilder;->modCount:I

    .line 6
    .line 7
    return-void
.end method

.method private final rehash(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->registerModification()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, v2}, Lkotlin/collections/builders/MapBuilder;->compact(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-array v0, p1, [I

    .line 17
    .line 18
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 19
    .line 20
    sget-object v0, Lkotlin/collections/builders/MapBuilder;->Companion:Lkotlin/collections/builders/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lkotlin/collections/builders/MapBuilder;->hashShift:I

    .line 32
    .line 33
    :goto_0
    iget p1, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 34
    .line 35
    if-ge v2, p1, :cond_2

    .line 36
    .line 37
    add-int/lit8 p1, v2, 0x1

    .line 38
    .line 39
    invoke-direct {p0, v2}, Lkotlin/collections/builders/MapBuilder;->putRehash(I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    move v2, p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string p0, "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"

    .line 48
    .line 49
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method private final removeEntryAt(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v1, v0, p1

    .line 8
    .line 9
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    aput-object v1, v0, p1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 16
    .line 17
    aget v0, v0, p1

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->removeHashAt(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    aput v1, v0, p1

    .line 26
    .line 27
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Lkotlin/collections/builders/MapBuilder;->size:I

    .line 33
    .line 34
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->registerModification()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final removeHashAt(I)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    move v1, p1

    .line 3
    move v2, v0

    .line 4
    :cond_0
    add-int/lit8 v3, p1, -0x1

    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    add-int/lit8 p1, p1, -0x1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move p1, v3

    .line 16
    :goto_1
    iget-object v3, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 17
    .line 18
    aget v4, v3, p1

    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    iget v5, p0, Lkotlin/collections/builders/MapBuilder;->maxProbeDistance:I

    .line 23
    .line 24
    if-le v2, v5, :cond_2

    .line 25
    .line 26
    aput v0, v3, v1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    if-nez v4, :cond_3

    .line 30
    .line 31
    aput v0, v3, v1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_3
    iget-object v3, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 35
    .line 36
    add-int/lit8 v5, v4, -0x1

    .line 37
    .line 38
    aget-object v3, v3, v5

    .line 39
    .line 40
    invoke-direct {p0, v3}, Lkotlin/collections/builders/MapBuilder;->hash(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sub-int/2addr v3, p1

    .line 45
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    add-int/lit8 v6, v6, -0x1

    .line 50
    .line 51
    and-int/2addr v3, v6

    .line 52
    if-lt v3, v2, :cond_0

    .line 53
    .line 54
    iget-object v2, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 55
    .line 56
    aput v4, v2, v1

    .line 57
    .line 58
    iget-object v2, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 59
    .line 60
    aput v1, v2, v5

    .line 61
    .line 62
    goto :goto_0
.end method

.method private final shouldCompact(I)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getCapacity$kotlin_stdlib()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    sub-int/2addr v1, v2

    .line 13
    if-ge v0, p1, :cond_0

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    if-lt v0, p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getCapacity$kotlin_stdlib()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    div-int/lit8 p0, p0, 0x4

    .line 23
    .line 24
    if-lt v1, p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlin/collections/builders/MapBuilder;->isReadOnly:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlin/collections/builders/SerializedMap;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lkotlin/collections/builders/SerializedMap;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance p0, Ljava/io/NotSerializableException;

    .line 12
    .line 13
    const-string v0, "The map cannot be serialized while it is being built."

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method


# virtual methods
.method public final addKey$kotlin_stdlib(Ljava/lang/Object;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->hash(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget v1, p0, Lkotlin/collections/builders/MapBuilder;->maxProbeDistance:I

    .line 9
    .line 10
    mul-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    div-int/lit8 v2, v2, 0x2

    .line 17
    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_0
    const/4 v2, 0x0

    .line 22
    :goto_1
    iget-object v3, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 23
    .line 24
    aget v3, v3, v0

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-nez v3, :cond_3

    .line 28
    .line 29
    iget v1, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 30
    .line 31
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getCapacity$kotlin_stdlib()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-lt v1, v3, :cond_1

    .line 36
    .line 37
    invoke-direct {p0, v4}, Lkotlin/collections/builders/MapBuilder;->ensureExtraCapacity(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget v1, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0x1

    .line 44
    .line 45
    iput v3, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 46
    .line 47
    iget-object v5, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 48
    .line 49
    aput-object p1, v5, v1

    .line 50
    .line 51
    iget-object p1, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 52
    .line 53
    aput v0, p1, v1

    .line 54
    .line 55
    iget-object p1, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 56
    .line 57
    aput v3, p1, v0

    .line 58
    .line 59
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    add-int/2addr p1, v4

    .line 64
    iput p1, p0, Lkotlin/collections/builders/MapBuilder;->size:I

    .line 65
    .line 66
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->registerModification()V

    .line 67
    .line 68
    .line 69
    iget p1, p0, Lkotlin/collections/builders/MapBuilder;->maxProbeDistance:I

    .line 70
    .line 71
    if-le v2, p1, :cond_2

    .line 72
    .line 73
    iput v2, p0, Lkotlin/collections/builders/MapBuilder;->maxProbeDistance:I

    .line 74
    .line 75
    :cond_2
    return v1

    .line 76
    :cond_3
    iget-object v5, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 77
    .line 78
    add-int/lit8 v6, v3, -0x1

    .line 79
    .line 80
    aget-object v5, v5, v6

    .line 81
    .line 82
    invoke-static {v5, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_4

    .line 87
    .line 88
    neg-int p0, v3

    .line 89
    return p0

    .line 90
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    if-le v2, v1, :cond_5

    .line 93
    .line 94
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    mul-int/lit8 v0, v0, 0x2

    .line 99
    .line 100
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->rehash(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    add-int/lit8 v3, v0, -0x1

    .line 105
    .line 106
    if-nez v0, :cond_6

    .line 107
    .line 108
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->getHashSize()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    sub-int/2addr v0, v4

    .line 113
    goto :goto_1

    .line 114
    :cond_6
    move v0, v3

    .line 115
    goto :goto_1
.end method

.method public final build()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lkotlin/collections/builders/MapBuilder;->isReadOnly:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lkotlin/collections/builders/MapBuilder;->Empty:Lkotlin/collections/builders/MapBuilder;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final checkIsMutable$kotlin_stdlib()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlin/collections/builders/MapBuilder;->isReadOnly:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public clear()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    move v2, v1

    .line 12
    :goto_0
    iget-object v3, p0, Lkotlin/collections/builders/MapBuilder;->presenceArray:[I

    .line 13
    .line 14
    aget v4, v3, v2

    .line 15
    .line 16
    if-ltz v4, :cond_0

    .line 17
    .line 18
    iget-object v5, p0, Lkotlin/collections/builders/MapBuilder;->hashArray:[I

    .line 19
    .line 20
    aput v1, v5, v4

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    aput v4, v3, v2

    .line 24
    .line 25
    :cond_0
    if-eq v2, v0, :cond_1

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 31
    .line 32
    iget v2, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲([Ljava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget v2, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲([Ljava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iput v1, p0, Lkotlin/collections/builders/MapBuilder;->size:I

    .line 47
    .line 48
    iput v1, p0, Lkotlin/collections/builders/MapBuilder;->length:I

    .line 49
    .line 50
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->registerModification()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final containsAllEntries$kotlin_stdlib(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lkotlin/collections/builders/MapBuilder;->containsEntry$kotlin_stdlib(Ljava/util/Map$Entry;)Z

    .line 24
    .line 25
    .line 26
    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    nop

    .line 30
    :catch_0
    :cond_1
    return v1

    .line 31
    :cond_2
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public final containsEntry$kotlin_stdlib(Ljava/util/Map$Entry;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->findKey(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_0
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    aget-object p0, p0, v0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->findKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->findValue(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final entriesIterator$kotlin_stdlib()Lkotlin/collections/builders/飘花落叶言子楪世哲兰苏;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getEntries()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ljava/util/Map;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->contentEquals(Ljava/util/Map;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->findKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    aget-object p0, p0, p1

    .line 15
    .line 16
    return-object p0
.end method

.method public final getCapacity$kotlin_stdlib()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/MapBuilder;->keysArray:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public getEntries()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->entriesView:Lkotlin/collections/builders/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lkotlin/collections/builders/飘花落叶言子楪苏世兰哲;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->entriesView:Lkotlin/collections/builders/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public getKeys()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->keysView:Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->keysView:Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public getSize()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/collections/builders/MapBuilder;->size:I

    .line 2
    .line 3
    return p0
.end method

.method public getValues()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesView:Lkotlin/collections/builders/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪苏哲兰世;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lkotlin/collections/builders/飘花落叶言子楪苏哲兰世;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesView:Lkotlin/collections/builders/飘花落叶言子楪苏哲兰世;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->entriesIterator$kotlin_stdlib()Lkotlin/collections/builders/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    iget v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 14
    .line 15
    iget-object v3, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lkotlin/collections/builders/MapBuilder;

    .line 18
    .line 19
    invoke-static {v3}, Lkotlin/collections/builders/MapBuilder;->access$getLength$p(Lkotlin/collections/builders/MapBuilder;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ge v2, v4, :cond_2

    .line 24
    .line 25
    iget v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 26
    .line 27
    add-int/lit8 v4, v2, 0x1

    .line 28
    .line 29
    iput v4, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 30
    .line 31
    iput v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 32
    .line 33
    invoke-static {v3}, Lkotlin/collections/builders/MapBuilder;->access$getKeysArray$p(Lkotlin/collections/builders/MapBuilder;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v4, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 38
    .line 39
    aget-object v2, v2, v4

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move v2, v0

    .line 49
    :goto_1
    invoke-static {v3}, Lkotlin/collections/builders/MapBuilder;->access$getValuesArray$p(Lkotlin/collections/builders/MapBuilder;)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget v4, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 57
    .line 58
    aget-object v3, v3, v4

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    move v3, v0

    .line 68
    :goto_2
    xor-int/2addr v2, v3

    .line 69
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世兰哲苏()V

    .line 70
    .line 71
    .line 72
    add-int/2addr v1, v2

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 75
    .line 76
    .line 77
    return v0

    .line 78
    :cond_3
    return v1
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final isReadOnly$kotlin_stdlib()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlin/collections/builders/MapBuilder;->isReadOnly:Z

    .line 2
    .line 3
    return p0
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getKeys()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final keysIterator$kotlin_stdlib()Lkotlin/collections/builders/飘花落叶言子楪世兰哲苏;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lkotlin/collections/builders/MapBuilder;->addKey$kotlin_stdlib(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-direct {p0}, Lkotlin/collections/builders/MapBuilder;->allocateValuesArray()[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-gez p1, :cond_0

    .line 13
    .line 14
    neg-int p1, p1

    .line 15
    add-int/lit8 p1, p1, -0x1

    .line 16
    .line 17
    aget-object v0, p0, p1

    .line 18
    .line 19
    aput-object p2, p0, p1

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    aput-object p2, p0, p1

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->putAllEntries(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->findKey(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-gez p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v0, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    aget-object v0, v0, p1

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->removeEntryAt(I)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final removeEntry$kotlin_stdlib(Ljava/util/Map$Entry;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->findKey(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    iget-object v2, p0, Lkotlin/collections/builders/MapBuilder;->valuesArray:[Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    aget-object v2, v2, v0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v2, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    invoke-direct {p0, v0}, Lkotlin/collections/builders/MapBuilder;->removeEntryAt(I)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public final removeKey$kotlin_stdlib(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->findKey(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-gez p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->removeEntryAt(I)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0
.end method

.method public final removeValue$kotlin_stdlib(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->findValue(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-gez p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lkotlin/collections/builders/MapBuilder;->removeEntryAt(I)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0
.end method

.method public final bridge size()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int/lit8 v1, v1, 0x3

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-string v1, "{"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->entriesIterator$kotlin_stdlib()Lkotlin/collections/builders/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    if-lez v1, :cond_0

    .line 31
    .line 32
    const-string v2, ", "

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_0
    iget v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 38
    .line 39
    iget-object v3, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lkotlin/collections/builders/MapBuilder;

    .line 42
    .line 43
    invoke-static {v3}, Lkotlin/collections/builders/MapBuilder;->access$getLength$p(Lkotlin/collections/builders/MapBuilder;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ge v2, v4, :cond_3

    .line 48
    .line 49
    iget v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 50
    .line 51
    add-int/lit8 v4, v2, 0x1

    .line 52
    .line 53
    iput v4, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 54
    .line 55
    iput v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 56
    .line 57
    invoke-static {v3}, Lkotlin/collections/builders/MapBuilder;->access$getKeysArray$p(Lkotlin/collections/builders/MapBuilder;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget v4, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 62
    .line 63
    aget-object v2, v2, v4

    .line 64
    .line 65
    const-string v4, "(this Map)"

    .line 66
    .line 67
    if-ne v2, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    :goto_1
    const/16 v2, 0x3d

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lkotlin/collections/builders/MapBuilder;->access$getValuesArray$p(Lkotlin/collections/builders/MapBuilder;)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget v5, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 89
    .line 90
    aget-object v2, v2, v5

    .line 91
    .line 92
    if-ne v2, v3, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世兰哲苏()V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 108
    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    return-object p0

    .line 112
    :cond_4
    const-string p0, "}"

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->getValues()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final valuesIterator$kotlin_stdlib()Lkotlin/collections/builders/飘花落叶言子楪苏世哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
