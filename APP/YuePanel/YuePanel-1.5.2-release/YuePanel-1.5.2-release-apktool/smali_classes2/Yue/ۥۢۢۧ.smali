.class public final LYue/ۥۢۢۧ;
.super LYue/ۥۢۢۦۧ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۥ۟ۡ;
.implements LYue/ۥۣۣۡۥ;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.5"
.end annotation

.annotation build LYue/ۥۢۥ۠ۧ;
    markerClass = {
        LYue/ۥ۠ۡۥۣ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۢۧ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e2\u06e6\u06e7;",
        "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
        "LYue/\u06e5\u06e2\u06e2\u06e6\u06e3;",
        ">;",
        "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
        "LYue/\u06e5\u06e2\u06e2\u06e6\u06e3;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۧ:LYue/ۥۢۢۧ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۨ:LYue/ۥۢۢۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LYue/ۥۢۢۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۢۧ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۢۧ;->ۥ۟۟۠ۧ:LYue/ۥۢۢۧ$ۥ;

    new-instance v0, LYue/ۥۢۢۧ;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LYue/ۥۢۢۧ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۢۧ;->ۥ۟۟۠ۨ:LYue/ۥۢۢۧ;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, v1}, LYue/ۥۢۢۦۧ;-><init>(IIILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public synthetic constructor <init>(IILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LYue/ۥۢۢۧ;-><init>(II)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۤ()LYue/ۥۢۢۧ;
    .locals 1

    sget-object v0, LYue/ۥۢۢۧ;->ۥ۟۟۠ۨ:LYue/ۥۢۢۧ;

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟ۧ()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Can throw an exception when it\'s impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It\'s recommended to use \'endInclusive\' property that doesn\'t throw."
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥۢۢۧ;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۢۢۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۢۢۧ;

    invoke-virtual {v0}, LYue/ۥۢۢۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v0

    check-cast p1, LYue/ۥۢۢۧ;

    invoke-virtual {p1}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v0

    invoke-virtual {p1}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result p1

    if-ne v0, p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LYue/ۥۢۢۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 2

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v1

    invoke-static {v1}, LYue/ۥۢۢۦۣ;->ۥ۟۟ۤ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v1

    invoke-static {v1}, LYue/ۥۢۢۦۣ;->ۥ۟۟ۤ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ(Ljava/lang/Comparable;)Z
    .locals 0

    check-cast p1, LYue/ۥۢۢۦۣ;

    invoke-virtual {p1}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۧ;->ۥ۟۟۟ۥ(I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۧ;->ۥ۟۟۠()I

    move-result v0

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۧ;->ۥ۟۟۟ۦ()I

    move-result v0

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۟۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۧ;->ۥ۟۟۟ۨ()I

    move-result v0

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۥ(I)Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 2

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟ۨ()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v0

    return v0
.end method
