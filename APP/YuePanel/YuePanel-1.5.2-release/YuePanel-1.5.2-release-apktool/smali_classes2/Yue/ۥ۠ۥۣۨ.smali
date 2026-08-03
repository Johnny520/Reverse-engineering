.class public final LYue/ۥ۠ۥۣۨ;
.super LYue/ۥ۠ۥۣۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۥ۟ۡ;
.implements LYue/ۥۣۣۡۥ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۥۣۨ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e5\u06e3\u06e6;",
        "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
        "Ljava/lang/Integer;",
        ">;",
        "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۧ:LYue/ۥ۠ۥۣۨ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۨ:LYue/ۥ۠ۥۣۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۠ۥۣۨ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۣۨ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۥۣۨ$ۥ;

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    sput-object v0, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۥۣۨ;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۠ۥۣۦ;-><init>(III)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۥ()LYue/ۥ۠ۥۣۨ;
    .locals 1

    sget-object v0, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۥۣۨ;

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟ۨ()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Can throw an exception when it\'s impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It\'s recommended to use \'endInclusive\' property that doesn\'t throw."
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

    instance-of v0, p1, LYue/ۥ۠ۥۣۨ;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۥۣۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۥۣۨ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v0

    check-cast p1, LYue/ۥ۠ۥۣۨ;

    invoke-virtual {p1}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v0

    invoke-virtual {p1}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

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

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v1

    if-le v0, v1, :cond_0

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

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ(Ljava/lang/Comparable;)Z
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۟ۦ(I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠۟()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۟ۧ()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۟۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۦ(I)Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v0

    if-gt v0, p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟ۧ()Ljava/lang/Integer;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۠()Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠۟()Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
