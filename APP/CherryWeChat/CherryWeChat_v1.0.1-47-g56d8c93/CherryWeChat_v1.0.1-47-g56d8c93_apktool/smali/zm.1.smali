.class public abstract Lzm;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LAm;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    sget-object v0, Lmm;->d:Llm;

    iget-object v1, v0, Lmm;->a:Lpm;

    iget-boolean v5, v1, Lpm;->c:Z

    iget-object v6, v1, Lpm;->d:Ljava/lang/String;

    iget-object v8, v1, Lpm;->f:Ljava/lang/String;

    iget v10, v1, Lpm;->h:I

    iget-boolean v9, v1, Lpm;->g:Z

    iget-object v0, v0, Lmm;->b:Lhw;

    const-string v1, "    "

    invoke-static {v6, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v2, Lpm;

    const/4 v3, 0x1

    move v4, v3

    move v7, v3

    invoke-direct/range {v2 .. v10}, Lpm;-><init>(ZZZLjava/lang/String;ZLjava/lang/String;ZI)V

    new-instance v1, LAm;

    invoke-direct {v1, v2, v0}, Lmm;-><init>(Lpm;Lhw;)V

    sget-object v2, LPj;->e:Lhw;

    invoke-static {v0, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    sput-object v1, Lzm;->a:LAm;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Indent should not be specified when default printing mode is used"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
