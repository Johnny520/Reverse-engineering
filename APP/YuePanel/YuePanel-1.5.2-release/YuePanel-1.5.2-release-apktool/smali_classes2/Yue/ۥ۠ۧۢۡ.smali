.class public final LYue/ۥ۠ۧۢۡ;
.super LYue/ۥ۟۟ۡۧ;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;
.implements LYue/ۥ۠ۦۣۡ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۧۢۡ$ۥ;,
        LYue/ۥ۠ۧۢۡ$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e1\u06e7<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;",
        "Ljava/io/Serializable;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e1;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟ۡ:LYue/ۥ۠ۧۢۡ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟ۡ۟:LYue/ۥ۠ۧۢۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:[Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:Z

.field public final ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e2\u06e1<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۨ:LYue/ۥ۠ۧۢۡ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e2\u06e1<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۧۢۡ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۧۢۡ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟ۡ:LYue/ۥ۠ۧۢۡ$ۥ;

    new-instance v0, LYue/ۥ۠ۧۢۡ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۧۢۡ;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۦ:Z

    sput-object v0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟ۡ۟:LYue/ۥ۠ۧۢۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    .line 8
    invoke-direct {p0, v0}, LYue/ۥ۠ۧۢۡ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 7

    .line 9
    invoke-static {p1}, LYue/ۥ۠ۧۢۢ;->ۥ۟۟۟(I)[Ljava/lang/Object;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v6}, LYue/ۥ۠ۧۢۡ;-><init>([Ljava/lang/Object;IIZLYue/ۥ۠ۧۢۡ;LYue/ۥ۠ۧۢۡ;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;IIZLYue/ۥ۠ۧۢۡ;LYue/ۥ۠ۧۢۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;IIZ",
            "LYue/\u06e5\u06e0\u06e7\u06e2\u06e1<",
            "TE;>;",
            "LYue/\u06e5\u06e0\u06e7\u06e2\u06e1<",
            "TE;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, LYue/ۥ۟۟ۡۧ;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    .line 3
    iput p2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    .line 4
    iput p3, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    .line 5
    iput-boolean p4, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۦ:Z

    .line 6
    iput-object p5, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    .line 7
    iput-object p6, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧۢۡ;

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥ۠ۧۢۡ;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥ۠ۧۢۡ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥ۠ۧۢۡ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    return p0
.end method

.method private final ۥ۟۟۟ۦ(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    if-nez v0, :cond_2

    if-ltz p1, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    array-length v1, v0

    if-le p1, v1, :cond_0

    sget-object v1, LYue/ۥ۟ۡۧۡ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۧۡ$ۥ;

    array-length v0, v0

    invoke-virtual {v1, v0, p1}, LYue/ۥ۟ۡۧۡ$ۥ;->ۥ(II)I

    move-result p1

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    invoke-static {v0, p1}, LYue/ۥ۠ۧۢۢ;->ۥ۟۟۟۟([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method private final ۥ۟۟۠ۢ()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۣۡۨ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥۣۡۨ;-><init>(Ljava/util/Collection;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/NotSerializableException;

    const-string v1, "The list cannot be serialized while it is being built."

    invoke-direct {v0, v1}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 3
    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    .line 4
    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟۟(II)V

    .line 5
    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0, p2}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۢ(ILjava/lang/Object;)V

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    .line 2
    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0, p1}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۢ(ILjava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 2
    .param p2    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    .line 5
    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟۟(II)V

    .line 6
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    .line 7
    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v1, p1

    invoke-virtual {p0, v1, p2, v0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟۠(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 3
    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr v1, v2

    invoke-virtual {p0, v1, p1, v0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟۠(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public clear()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠۠(II)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۥ(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟(II)V

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-static {v0, v1, v2}, LYue/ۥ۠ۧۢۢ;->ۥ۟([Ljava/lang/Object;II)I

    move-result v0

    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۧۢۡ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥ۠ۧۢۡ$ۥ۟;-><init>(LYue/ۥ۠ۧۢۡ;I)V

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    new-instance v0, LYue/ۥ۠ۧۢۡ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥ۠ۧۢۡ$ۥ۟;-><init>(LYue/ۥ۠ۧۢۡ;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    .line 2
    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟۟(II)V

    .line 3
    new-instance v0, LYue/ۥ۠ۧۢۡ$ۥ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۧۢۡ$ۥ۟;-><init>(LYue/ۥ۠ۧۢۡ;I)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۢۡ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۡۧ;->remove(I)Ljava/lang/Object;

    :cond_0
    if-ltz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, p1, v2}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۡ(IILjava/util/Collection;Z)I

    move-result p1

    if-lez p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, p1, v2}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۡ(IILjava/util/Collection;Z)I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟(II)V

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int v2, v1, p1

    aget-object v2, v0, v2

    add-int/2addr v1, p1

    aput-object p2, v0, v1

    return-object v2
.end method

.method public subList(II)Ljava/util/List;
    .locals 9
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, p1, p2, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟۟۟(III)V

    new-instance v0, LYue/ۥ۠ۧۢۡ;

    iget-object v3, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int v4, v1, p1

    sub-int v5, p2, p1

    iget-boolean v6, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۦ:Z

    iget-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧۢۡ;

    if-nez p1, :cond_0

    move-object v8, p0

    goto :goto_0

    :cond_0
    move-object v8, p1

    :goto_0
    move-object v2, v0

    move-object v7, p0

    invoke-direct/range {v2 .. v8}, LYue/ۥ۠ۧۢۡ;-><init>([Ljava/lang/Object;IIZLYue/ۥ۠ۧۢۡ;LYue/ۥ۠ۧۢۡ;)V

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 6
    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr v2, v1

    invoke-static {v0, v1, v2}, LYue/ۥ۟ۢ۟۟;->ۥ۟۠۟۟([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .param p1    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    const-string v0, "destination"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    array-length v0, p1

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, v2, v1, p1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOfRange(array, offse\u2026h, destination.javaClass)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v1, v2

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v2, v1}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۥۨ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 4
    array-length v0, p1

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    .line 5
    aput-object v0, p1, v1

    :cond_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-static {v0, v1, v2}, LYue/ۥ۠ۧۢۢ;->ۥ۟۟([Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public ۥ۟(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟(II)V

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠۟(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۠(ILjava/util/Collection;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;I)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟۠(ILjava/util/Collection;I)V

    iget-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    iget-object p1, p1, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr p1, p3

    iput p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1, p3}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۨ(II)V

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    add-int v2, p1, v0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۥ۟۟۟ۢ(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۢ(ILjava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    iget-object p1, p1, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr p1, v1

    iput p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, v1}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۨ(II)V

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    aput-object p2, v0, p1

    :goto_0
    return-void
.end method

.method public final ۥۣ۟۟۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    if-nez v0, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۤ()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۦ:Z

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟ۡ۟:LYue/ۥ۠ۧۢۡ;

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ۥ۟۟۟ۤ()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ۥ۟۟۟ۥ(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-static {v0, v1, v2, p1}, LYue/ۥ۠ۧۢۢ;->ۥ([Ljava/lang/Object;IILjava/util/List;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۧ(I)V
    .locals 1

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۦ(I)V

    return-void
.end method

.method public final ۥ۟۟۟ۨ(II)V
    .locals 3

    invoke-virtual {p0, p2}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۟ۧ(I)V

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr v1, v2

    add-int v2, p1, p2

    invoke-static {v0, v0, v2, p1, v1}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۥۨ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr p1, p2

    iput p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public final ۥ۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۦ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧۢۡ;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۦ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final ۥ۟۟۠۟(I)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠۟(I)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    aget-object v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v4, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr v3, v4

    invoke-static {v0, v0, p1, v2, v3}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۥۨ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, LYue/ۥ۠ۧۢۢ;->ۥ۟۟۟۠([Ljava/lang/Object;I)V

    iget p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return-object v1
.end method

.method public final ۥ۟۟۠۠(II)V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠۠(II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    add-int v1, p1, p2

    iget v2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    invoke-static {v0, v0, p1, v1, v2}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۥۨ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    sub-int v1, v0, p2

    invoke-static {p1, v1, v0}, LYue/ۥ۠ۧۢۢ;->ۥ۟۟۟ۡ([Ljava/lang/Object;II)V

    :goto_0
    iget p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    sub-int/2addr p1, p2

    iput p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public final ۥ۟۟۠ۡ(IILjava/util/Collection;Z)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Collection<",
            "+TE;>;Z)I"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧۢۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۡ(IILjava/util/Collection;Z)I

    move-result p1

    iget p2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    sub-int/2addr p2, p1

    iput p2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return p1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p2, :cond_2

    iget-object v2, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    add-int v3, p1, v0

    aget-object v2, v2, v3

    invoke-interface {p3, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, p4, :cond_1

    iget-object v2, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    add-int/2addr v1, p1

    add-int/lit8 v0, v0, 0x1

    aget-object v3, v2, v3

    aput-object v3, v2, v1

    move v1, v4

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    sub-int p3, p2, v1

    iget-object p4, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    add-int/2addr p2, p1

    iget v0, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    add-int/2addr p1, v1

    invoke-static {p4, p4, p1, p2, v0}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۥۨ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, LYue/ۥ۠ۧۢۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget p2, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    sub-int p4, p2, p3

    invoke-static {p1, p4, p2}, LYue/ۥ۠ۧۢۢ;->ۥ۟۟۟ۡ([Ljava/lang/Object;II)V

    iget p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    sub-int/2addr p1, p3

    iput p1, p0, LYue/ۥ۠ۧۢۡ;->ۥ۟۟۠ۥ:I

    return p3
.end method
