.class public abstract LYue/ۥۣ۟۟ۢ;
.super LYue/ۥ۟۟۠ۦ;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.1"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟۟ۢ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e6<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۣ۟۟ۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣ۟۟ۢ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟۟ۢ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣ۟۟ۢ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟۟۠ۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v0, LYue/ۥۣ۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣ۟۟ۢ$ۥ;

    check-cast p1, Ljava/util/Set;

    invoke-virtual {v0, p0, p1}, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ(Ljava/util/Set;Ljava/util/Set;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    sget-object v0, LYue/ۥۣ۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣ۟۟ۢ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ۟(Ljava/util/Collection;)I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
