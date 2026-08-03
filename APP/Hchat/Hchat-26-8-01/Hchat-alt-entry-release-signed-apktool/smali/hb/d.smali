.class public final synthetic Lhb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lhb/k;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lhb/k;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhb/d;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lhb/d;->h:Lhb/k;

    .line 7
    .line 8
    iput p3, p0, Lhb/d;->i:I

    .line 9
    .line 10
    iput p4, p0, Lhb/d;->j:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/d;->h:Lhb/k;

    .line 2
    .line 3
    iget-object v1, v0, Lhb/k;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lhb/d;->g:Ljava/lang/Object;

    .line 6
    .line 7
    if-eq v2, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v1, v0, Lhb/k;->g:Lhb/i;

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    iget-object v2, v0, Lhb/k;->i:Lb9/c;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v3, v0, Lhb/k;->c:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v2, 0x0

    .line 24
    iput-object v2, v0, Lhb/k;->i:Lb9/c;

    .line 25
    .line 26
    iput-object v2, v0, Lhb/k;->h:Ljava/lang/Object;

    .line 27
    .line 28
    iget v2, p0, Lhb/d;->i:I

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    iget v2, p0, Lhb/d;->j:I

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 v2, 0x0

    .line 39
    :goto_0
    invoke-virtual {v0, v1, v2}, Lhb/k;->a(Lhb/i;Z)V

    .line 40
    .line 41
    .line 42
    :cond_3
    :goto_1
    return-void
.end method
