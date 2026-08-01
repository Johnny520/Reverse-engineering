.class public final Lkotlin/collections/builders/ListBuilder;
.super Lkotlin/collections/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/collections/builders/ListBuilder$BuilderSubList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/collections/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010)\n\u0002\u0008\u0002\n\u0002\u0010+\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u000f\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008&\u0008\u0000\u0018\u0000 b*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003cdeB\u0011\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0008H\u0096\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00082\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016\u00a2\u0006\u0004\u0008(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0008H\u0017\u00a2\u0006\u0004\u0008-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016\u00a2\u0006\u0004\u0008/\u0010)J\u001d\u00100\u001a\u00020\u000f2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&H\u0016\u00a2\u0006\u0004\u00080\u0010)J%\u00103\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\u00082\u0006\u00102\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00083\u00104J)\u00108\u001a\u0008\u0012\u0004\u0012\u00028\u000106\"\u0004\u0008\u0001\u001052\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00028\u000106H\u0016\u00a2\u0006\u0004\u00088\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016\u00a2\u0006\u0004\u00088\u0010;J\u001a\u0010=\u001a\u00020\u000f2\u0008\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002\u00a2\u0006\u0004\u0008=\u0010#J\u000f\u0010>\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016\u00a2\u0006\u0004\u0008A\u0010BJ\u000f\u0010C\u001a\u00020:H\u0002\u00a2\u0006\u0004\u0008C\u0010DJ\u000f\u0010E\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008E\u0010,J\u000f\u0010F\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008F\u0010,J\u0017\u0010H\u001a\u00020$2\u0006\u0010G\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008H\u0010\u000bJ\u0017\u0010J\u001a\u00020$2\u0006\u0010I\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008J\u0010\u000bJ\u001b\u0010K\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\u0008\u00030\u000cH\u0002\u00a2\u0006\u0004\u0008K\u0010LJ\u001f\u0010N\u001a\u00020$2\u0006\u0010M\u001a\u00020\u00082\u0006\u0010G\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008N\u0010OJ\u001f\u0010P\u001a\u00020$2\u0006\u0010M\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008P\u0010%J-\u0010Q\u001a\u00020$2\u0006\u0010M\u001a\u00020\u00082\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010G\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008Q\u0010RJ\u0017\u0010S\u001a\u00028\u00002\u0006\u0010M\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008S\u0010\u0014J\u001f\u0010V\u001a\u00020$2\u0006\u0010T\u001a\u00020\u00082\u0006\u0010U\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008V\u0010OJ5\u0010X\u001a\u00020\u00082\u0006\u0010T\u001a\u00020\u00082\u0006\u0010U\u001a\u00020\u00082\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010W\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008X\u0010YR\u001c\u0010Z\u001a\u0008\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0016\u0010\\\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0014\u0010a\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008`\u0010?\u00a8\u0006f"
    }
    d2 = {
        "Lkotlin/collections/builders/ListBuilder;",
        "E",
        "",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "Lkotlin/collections/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "",
        "initialCapacity",
        "<init>",
        "(I)V",
        "",
        "build",
        "()Ljava/util/List;",
        "",
        "isEmpty",
        "()Z",
        "index",
        "get",
        "(I)Ljava/lang/Object;",
        "element",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "indexOf",
        "(Ljava/lang/Object;)I",
        "lastIndexOf",
        "",
        "iterator",
        "()Ljava/util/Iterator;",
        "",
        "listIterator",
        "()Ljava/util/ListIterator;",
        "(I)Ljava/util/ListIterator;",
        "add",
        "(Ljava/lang/Object;)Z",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "(ILjava/lang/Object;)V",
        "",
        "elements",
        "addAll",
        "(Ljava/util/Collection;)Z",
        "(ILjava/util/Collection;)Z",
        "clear",
        "()V",
        "removeAt",
        "remove",
        "removeAll",
        "retainAll",
        "fromIndex",
        "toIndex",
        "subList",
        "(II)Ljava/util/List;",
        "T",
        "",
        "array",
        "toArray",
        "([Ljava/lang/Object;)[Ljava/lang/Object;",
        "",
        "()[Ljava/lang/Object;",
        "other",
        "equals",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "writeReplace",
        "()Ljava/lang/Object;",
        "registerModification",
        "checkIsMutable",
        "n",
        "ensureExtraCapacity",
        "minCapacity",
        "ensureCapacityInternal",
        "contentEquals",
        "(Ljava/util/List;)Z",
        "i",
        "insertAtInternal",
        "(II)V",
        "addAtInternal",
        "addAllInternal",
        "(ILjava/util/Collection;I)V",
        "removeAtInternal",
        "rangeOffset",
        "rangeLength",
        "removeRangeInternal",
        "retain",
        "retainOrRemoveAllInternal",
        "(IILjava/util/Collection;Z)I",
        "backing",
        "[Ljava/lang/Object;",
        "length",
        "I",
        "isReadOnly",
        "Z",
        "getSize",
        "size",
        "Companion",
        "kotlin/collections/builders/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2",
        "androidx/compose/runtime/snapshots/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u82cf\u4e16",
        "BuilderSubList",
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
.field private static final Companion:Lkotlin/collections/builders/飘花落叶言子楪世苏兰哲;

.field private static final Empty:Lkotlin/collections/builders/ListBuilder;


# instance fields
.field private backing:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field private isReadOnly:Z

.field private length:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/collections/builders/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/collections/builders/ListBuilder;->Companion:Lkotlin/collections/builders/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    new-instance v0, Lkotlin/collections/builders/ListBuilder;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lkotlin/collections/builders/ListBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Lkotlin/collections/builders/ListBuilder;->isReadOnly:Z

    .line 16
    .line 17
    sput-object v0, Lkotlin/collections/builders/ListBuilder;->Empty:Lkotlin/collections/builders/ListBuilder;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 19
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lkotlin/collections/builders/ListBuilder;-><init>(IILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "capacity must be non-negative."

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0xa

    .line 18
    :cond_0
    invoke-direct {p0, p1}, Lkotlin/collections/builders/ListBuilder;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$addAllInternal(Lkotlin/collections/builders/ListBuilder;ILjava/util/Collection;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lkotlin/collections/builders/ListBuilder;->addAllInternal(ILjava/util/Collection;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$addAtInternal(Lkotlin/collections/builders/ListBuilder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlin/collections/builders/ListBuilder;->addAtInternal(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getBacking$p(Lkotlin/collections/builders/ListBuilder;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLength$p(Lkotlin/collections/builders/ListBuilder;)I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getModCount$p$s-2084097795(Lkotlin/collections/builders/ListBuilder;)I
    .locals 0

    .line 1
    iget p0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$isReadOnly$p(Lkotlin/collections/builders/ListBuilder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlin/collections/builders/ListBuilder;->isReadOnly:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$removeAtInternal(Lkotlin/collections/builders/ListBuilder;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlin/collections/builders/ListBuilder;->removeAtInternal(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$removeRangeInternal(Lkotlin/collections/builders/ListBuilder;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlin/collections/builders/ListBuilder;->removeRangeInternal(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$retainOrRemoveAllInternal(Lkotlin/collections/builders/ListBuilder;IILjava/util/Collection;Z)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlin/collections/builders/ListBuilder;->retainOrRemoveAllInternal(IILjava/util/Collection;Z)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final addAllInternal(ILjava/util/Collection;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->registerModification()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p3}, Lkotlin/collections/builders/ListBuilder;->insertAtInternal(II)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p3, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 15
    .line 16
    add-int v2, p1, v0

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    aput-object v3, v1, v2

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private final addAtInternal(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->registerModification()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p1, v0}, Lkotlin/collections/builders/ListBuilder;->insertAtInternal(II)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 9
    .line 10
    aput-object p2, p0, p1

    .line 11
    .line 12
    return-void
.end method

.method private final checkIsMutable()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlin/collections/builders/ListBuilder;->isReadOnly:Z

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

.method private final contentEquals(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 2
    .line 3
    iget p0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq p0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    if-ge v1, p0, :cond_2

    .line 15
    .line 16
    aget-object v3, v0, v1

    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    :goto_1
    return v2

    .line 29
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method private final ensureCapacityInternal(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method private final ensureExtraCapacity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    invoke-direct {p0, v0}, Lkotlin/collections/builders/ListBuilder;->ensureCapacityInternal(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final insertAtInternal(II)V
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lkotlin/collections/builders/ListBuilder;->ensureExtraCapacity(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 5
    .line 6
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 7
    .line 8
    add-int v2, p1, p2

    .line 9
    .line 10
    invoke-static {v2, p1, v0, v1, v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰哲苏(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 14
    .line 15
    add-int/2addr p1, p2

    .line 16
    iput p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 17
    .line 18
    return-void
.end method

.method private final registerModification()V
    .locals 1

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    .line 7
    return-void
.end method

.method private final removeAtInternal(I)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->registerModification()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 5
    .line 6
    aget-object v1, v0, p1

    .line 7
    .line 8
    add-int/lit8 v2, p1, 0x1

    .line 9
    .line 10
    iget v3, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 11
    .line 12
    invoke-static {p1, v2, v0, v3, v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰哲苏(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 16
    .line 17
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object v2, p1, v0

    .line 26
    .line 27
    iget p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    iput p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 32
    .line 33
    return-object v1
.end method

.method private final removeRangeInternal(II)V
    .locals 3

    .line 1
    if-lez p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->registerModification()V

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 7
    .line 8
    add-int v1, p1, p2

    .line 9
    .line 10
    iget v2, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 11
    .line 12
    invoke-static {p1, v1, v0, v2, v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰哲苏(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 16
    .line 17
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 18
    .line 19
    sub-int v1, v0, p2

    .line 20
    .line 21
    invoke-static {p1, v1, v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子世苏楪兰哲([Ljava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 25
    .line 26
    sub-int/2addr p1, p2

    .line 27
    iput p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 28
    .line 29
    return-void
.end method

.method private final retainOrRemoveAllInternal(IILjava/util/Collection;Z)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Collection<",
            "+TE;>;Z)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 4
    .line 5
    if-ge v0, p2, :cond_1

    .line 6
    .line 7
    add-int v3, p1, v0

    .line 8
    .line 9
    aget-object v2, v2, v3

    .line 10
    .line 11
    invoke-interface {p3, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ne v2, p4, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 18
    .line 19
    add-int/lit8 v4, v1, 0x1

    .line 20
    .line 21
    add-int/2addr v1, p1

    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    aget-object v3, v2, v3

    .line 25
    .line 26
    aput-object v3, v2, v1

    .line 27
    .line 28
    move v1, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sub-int p3, p2, v1

    .line 34
    .line 35
    add-int/2addr p2, p1

    .line 36
    iget p4, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 37
    .line 38
    add-int/2addr p1, v1

    .line 39
    invoke-static {p1, p2, v2, p4, v2}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰哲苏(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 43
    .line 44
    iget p2, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 45
    .line 46
    sub-int p4, p2, p3

    .line 47
    .line 48
    invoke-static {p1, p4, p2}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子世苏楪兰哲([Ljava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    if-lez p3, :cond_2

    .line 52
    .line 53
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->registerModification()V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 57
    .line 58
    sub-int/2addr p1, p3

    .line 59
    iput p1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 60
    .line 61
    return p3
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lkotlin/collections/builders/ListBuilder;->isReadOnly:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlin/collections/builders/SerializedCollection;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lkotlin/collections/builders/SerializedCollection;-><init>(Ljava/util/Collection;I)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance p0, Ljava/io/NotSerializableException;

    .line 13
    .line 14
    const-string v0, "The list cannot be serialized while it is being built."

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Lkotlin/collections/builders/ListBuilder;->addAtInternal(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 19
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    invoke-direct {p0, v0, p1}, Lkotlin/collections/builders/ListBuilder;->addAtInternal(ILjava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {p0, p1, p2, v0}, Lkotlin/collections/builders/ListBuilder;->addAllInternal(ILjava/util/Collection;I)V

    .line 22
    .line 23
    .line 24
    if-lez v0, :cond_0

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

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 31
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 32
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    invoke-direct {p0, v1, p1, v0}, Lkotlin/collections/builders/ListBuilder;->addAllInternal(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final build()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lkotlin/collections/builders/ListBuilder;->isReadOnly:Z

    .line 6
    .line 7
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/collections/builders/ListBuilder;->Empty:Lkotlin/collections/builders/ListBuilder;

    .line 13
    .line 14
    return-object p0
.end method

.method public clear()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lkotlin/collections/builders/ListBuilder;->removeRangeInternal(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lkotlin/collections/builders/ListBuilder;->contentEquals(Ljava/util/List;)Z

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

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(II)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object p0, p0, p1

    .line 14
    .line 15
    return-object p0
.end method

.method public getSize()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 2
    .line 3
    iget p0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, p0, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v4, v2

    .line 22
    :goto_1
    add-int/2addr v1, v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    invoke-static {v1, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, -0x1

    .line 21
    return p0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lkotlin/collections/builders/ListBuilder;->listIterator(I)Ljava/util/ListIterator;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    :goto_0
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, -0x1

    .line 22
    return p0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lkotlin/collections/builders/ListBuilder;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲苏世;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲苏世;-><init>(Lkotlin/collections/builders/ListBuilder;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lkotlin/collections/builders/ListBuilder;->indexOf(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lkotlin/collections/builders/ListBuilder;->removeAt(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    if-ltz p1, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
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
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v1, v0, p1, v1}, Lkotlin/collections/builders/ListBuilder;->retainOrRemoveAllInternal(IILjava/util/Collection;Z)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-lez p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    return v1
.end method

.method public removeAt(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(II)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Lkotlin/collections/builders/ListBuilder;->removeAtInternal(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 3
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
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {p0, v1, v0, p1, v2}, Lkotlin/collections/builders/ListBuilder;->retainOrRemoveAllInternal(IILjava/util/Collection;Z)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-lez p0, :cond_0

    .line 16
    .line 17
    return v2

    .line 18
    :cond_0
    return v1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlin/collections/builders/ListBuilder;->checkIsMutable()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(II)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v0, p0, p1

    .line 17
    .line 18
    aput-object p2, p0, p1

    .line 19
    .line 20
    return-object v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(III)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lkotlin/collections/builders/ListBuilder$BuilderSubList;

    .line 12
    .line 13
    iget-object v3, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 14
    .line 15
    sub-int v5, p2, p1

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    move-object v7, p0

    .line 19
    move v4, p1

    .line 20
    invoke-direct/range {v2 .. v7}, Lkotlin/collections/builders/ListBuilder$BuilderSubList;-><init>([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V

    .line 21
    .line 22
    .line 23
    return-object v2
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .line 36
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget p0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    invoke-static {v0, v1, p0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲楪兰苏([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    iget v1, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 6
    .line 7
    iget-object v2, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {v2, v3, v1, p0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-static {v3, v3, v2, v1, p1}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰哲苏(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget p0, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 28
    .line 29
    array-length v0, p1

    .line 30
    if-ge p0, v0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    aput-object v0, p1, p0

    .line 34
    .line 35
    :cond_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/ListBuilder;->backing:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lkotlin/collections/builders/ListBuilder;->length:I

    .line 5
    .line 6
    invoke-static {v0, v1, v2, p0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰([Ljava/lang/Object;IILkotlin/collections/飘花落叶言子楪苏世兰哲;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
