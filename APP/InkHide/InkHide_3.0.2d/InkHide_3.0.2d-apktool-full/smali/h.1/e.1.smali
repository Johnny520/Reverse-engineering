.class public final Lh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lh/f;

.field public final synthetic b:Lh/o;

.field public final synthetic c:Lh/m;

.field public final synthetic d:LC/j;


# direct methods
.method public constructor <init>(LC/j;Lh/f;Lh/o;Lh/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/e;->d:LC/j;

    .line 5
    .line 6
    iput-object p2, p0, Lh/e;->a:Lh/f;

    .line 7
    .line 8
    iput-object p3, p0, Lh/e;->b:Lh/o;

    .line 9
    .line 10
    iput-object p4, p0, Lh/e;->c:Lh/m;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh/e;->a:Lh/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lh/e;->d:LC/j;

    .line 6
    .line 7
    iget-object v2, v1, LC/j;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lh/g;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    iput-boolean v3, v2, Lh/g;->A:Z

    .line 13
    .line 14
    iget-object v0, v0, Lh/f;->b:Lh/m;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v2}, Lh/m;->c(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, LC/j;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lh/g;

    .line 23
    .line 24
    iput-boolean v2, v0, Lh/g;->A:Z

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lh/e;->b:Lh/o;

    .line 27
    .line 28
    invoke-virtual {v0}, Lh/o;->isEnabled()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Lh/o;->hasSubMenu()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lh/e;->c:Lh/m;

    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-virtual {v1, v0, v3, v2}, Lh/m;->q(Landroid/view/MenuItem;Lh/z;I)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method
