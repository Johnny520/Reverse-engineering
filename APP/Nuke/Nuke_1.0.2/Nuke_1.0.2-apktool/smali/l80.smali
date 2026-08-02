.class public final Ll80;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lia1;
.implements Ltc2;
.implements Llb3;


# instance fields
.field public final h:Lla1;

.field public final i:Lrc2;

.field public final j:Lkb3;

.field public k:Z

.field public l:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lla1;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lla1;-><init>(Lia1;Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll80;->h:Lla1;

    .line 11
    .line 12
    new-instance v0, Lsc2;

    .line 13
    .line 14
    new-instance v1, Lta;

    .line 15
    .line 16
    const/16 v2, 0x14

    .line 17
    .line 18
    invoke-direct {v1, v2, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0, v1}, Lsc2;-><init>(Ltc2;Lta;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lrc2;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lrc2;-><init>(Lsc2;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ll80;->i:Lrc2;

    .line 30
    .line 31
    new-instance v0, Lkb3;

    .line 32
    .line 33
    invoke-direct {v0}, Lkb3;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Ll80;->j:Lkb3;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll80;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Ll80;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lz91;->ON_PAUSE:Lz91;

    .line 11
    .line 12
    iget-object v1, p0, Ll80;->h:Lla1;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lla1;->e(Lz91;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lz91;->ON_STOP:Lz91;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lla1;->e(Lz91;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lz91;->ON_DESTROY:Lz91;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lla1;->e(Lz91;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Ll80;->j:Lkb3;

    .line 28
    .line 29
    invoke-virtual {v0}, Lkb3;->a()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Ll80;->l:Z

    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final getLifecycle()Lba1;
    .locals 0

    .line 1
    iget-object p0, p0, Ll80;->h:Lla1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSavedStateRegistry()Lqc2;
    .locals 0

    .line 1
    iget-object p0, p0, Ll80;->i:Lrc2;

    .line 2
    .line 3
    iget-object p0, p0, Lrc2;->b:Lqc2;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getViewModelStore()Lkb3;
    .locals 0

    .line 1
    iget-object p0, p0, Ll80;->j:Lkb3;

    .line 2
    .line 3
    return-object p0
.end method
