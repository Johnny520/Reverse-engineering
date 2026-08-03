.class public final LZr;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:LSm;

.field public final b:Ljava/util/List;

.field public final c:Ltc;


# direct methods
.method public constructor <init>(LSm;Ltc;)V
    .locals 2

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "Argument must not be null"

    invoke-static {v1, p1}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LZr;->a:LSm;

    invoke-static {v1, v0}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, LZr;->b:Ljava/util/List;

    invoke-static {v1, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, LZr;->c:Ltc;

    return-void
.end method
