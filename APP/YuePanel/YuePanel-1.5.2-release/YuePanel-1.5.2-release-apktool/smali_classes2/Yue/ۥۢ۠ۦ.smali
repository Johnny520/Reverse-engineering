.class public abstract LYue/ۥۢ۠ۦ;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;
.implements LYue/ۥۢ۠ۥۧ;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e4;",
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e2<",
        "Ljava/lang/Object;",
        ">;",
        "LYue/\u06e5\u06e2\u06e0\u06e5\u06e7;"
    }
.end annotation


# instance fields
.field private final arity:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method

.method public constructor <init>(ILYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, LYue/ۥ۟ۧۤۤ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    .line 2
    iput p1, p0, LYue/ۥۢ۠ۦ;->arity:I

    return-void
.end method


# virtual methods
.method public getArity()I
    .locals 1

    iget v0, p0, LYue/ۥۢ۠ۦ;->arity:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۢۥۢ;->getCompletion()LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, LYue/ۥۡۦۣ;->ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(this)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, LYue/ۥ۟ۢۥۢ;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
