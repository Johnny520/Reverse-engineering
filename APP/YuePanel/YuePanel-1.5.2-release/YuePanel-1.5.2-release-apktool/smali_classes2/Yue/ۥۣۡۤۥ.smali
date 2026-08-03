.class public final LYue/ۥۣۡۤۥ;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۡۤۥ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "LYue/\u06e5\u06df\u06e3\u06e5\u06e4;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:LYue/ۥۣۡۤۥ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ۟۟۠ۤ:[LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:[I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣۡۤۥ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣۡۤۥ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۦ:LYue/ۥۣۡۤۥ$ۥ;

    return-void
.end method

.method public constructor <init>([LYue/ۥۣ۟ۥۤ;[I)V
    .locals 0

    .line 2
    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۤ:[LYue/ۥۣ۟ۥۤ;

    .line 4
    iput-object p2, p0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۥ:[I

    return-void
.end method

.method public synthetic constructor <init>([LYue/ۥۣ۟ۥۤ;[ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LYue/ۥۣۡۤۥ;-><init>([LYue/ۥۣ۟ۥۤ;[I)V

    return-void
.end method

.method public static final varargs ۥۣ۟۟۟([LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۡۤۥ;
    .locals 1
    .param p0    # [LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۦ:LYue/ۥۣۡۤۥ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۟([LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۡۤۥ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LYue/ۥۣ۟ۥۤ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۤۥ;->ۥ۟(LYue/ۥۣ۟ۥۤ;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣۡۤۥ;->ۥ۟۟(I)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, LYue/ۥۣ۟ۥۤ;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۤۥ;->ۥ۟۟۟۠(LYue/ۥۣ۟ۥۤ;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, LYue/ۥۣ۟ۥۤ;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۤۥ;->ۥ۟۟۟ۢ(LYue/ۥۣ۟ۥۤ;)I

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۤ:[LYue/ۥۣ۟ۥۤ;

    array-length v0, v0

    return v0
.end method

.method public bridge ۥ۟(LYue/ۥۣ۟ۥۤ;)Z
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۟۟۠ۦ;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(I)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۤ:[LYue/ۥۣ۟ۥۤ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۥ۟۟۟()[LYue/ۥۣ۟ۥۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۤ:[LYue/ۥۣ۟ۥۤ;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()[I
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۥ:[I

    return-object v0
.end method

.method public bridge ۥ۟۟۟۠(LYue/ۥۣ۟ۥۤ;)I
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۟۟ۡۢ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge ۥ۟۟۟ۢ(LYue/ۥۣ۟ۥۤ;)I
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۟۟ۡۢ;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
