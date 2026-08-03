.class public abstract LYue/ۥ۠ۦۨ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e2<",
        "TR;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private final arity:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥ۠ۦۨ۟;->arity:I

    return-void
.end method


# virtual methods
.method public getArity()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۦۨ۟;->arity:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۣ;->ۥ۟۟۠ۧ(LYue/ۥ۠ۦۨ۟;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(this)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
