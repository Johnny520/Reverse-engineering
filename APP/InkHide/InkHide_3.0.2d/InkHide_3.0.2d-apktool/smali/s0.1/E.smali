.class public final synthetic Ls0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;


# instance fields
.field public final synthetic a:Ls0/J;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Ls0/J;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/E;->a:Ls0/J;

    iput-boolean p2, p0, Ls0/E;->b:Z

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lz0/b;

    .line 2
    .line 3
    const-string v0, "result"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lr0/i1;

    .line 9
    .line 10
    iget-boolean v1, p0, Ls0/E;->b:Z

    .line 11
    .line 12
    iget-object v2, p0, Ls0/E;->a:Ls0/J;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, p1}, Lr0/i1;-><init>(ZLs0/J;Lz0/b;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    sget-object p1, LE0/i;->a:LE0/i;

    .line 21
    .line 22
    return-object p1
.end method
