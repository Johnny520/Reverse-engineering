.class public final Lfb/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:Lorg/luckypray/dexkit/DexKitBridge;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:Lfb/l1;

.field public final o:Lfb/d0;

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;

.field public final r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfb/j0;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 7
    .line 8
    iput-object p3, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lfb/j0;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lfb/j0;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lfb/j0;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p7, p0, Lfb/j0;->m:Z

    .line 17
    .line 18
    new-instance p2, Lfb/l1;

    .line 19
    .line 20
    new-instance p4, Ljava/io/File;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p5, "Hchat_agent_reverse"

    .line 27
    .line 28
    invoke-direct {p4, p1, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p2, p4, p3}, Lfb/l1;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lfb/j0;->n:Lfb/l1;

    .line 35
    .line 36
    new-instance p1, Lfb/d0;

    .line 37
    .line 38
    invoke-direct {p1, p2, p3}, Lfb/d0;-><init>(Lfb/l1;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lfb/j0;->o:Lfb/d0;

    .line 42
    .line 43
    new-instance p1, Lfb/i0;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-direct {p1, p0, p2}, Lfb/i0;-><init>(Lfb/j0;I)V

    .line 47
    .line 48
    .line 49
    sget-object p2, Lsf/d;->g:Lsf/d;

    .line 50
    .line 51
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lfb/j0;->p:Ljava/lang/Object;

    .line 56
    .line 57
    new-instance p1, Lfb/i0;

    .line 58
    .line 59
    const/4 p3, 0x1

    .line 60
    invoke-direct {p1, p0, p3}, Lfb/i0;-><init>(Lfb/j0;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lfb/j0;->q:Ljava/lang/Object;

    .line 68
    .line 69
    new-instance p1, Lfb/i0;

    .line 70
    .line 71
    const/4 p3, 0x2

    .line 72
    invoke-direct {p1, p0, p3}, Lfb/i0;-><init>(Lfb/j0;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lfb/j0;->r:Ljava/lang/Object;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfb/j0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La7/c;

    .line 14
    .line 15
    invoke-virtual {v0}, La7/c;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    :cond_0
    iget-boolean v0, p0, Lfb/j0;->m:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_1
    iget-object v0, p0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 23
    .line 24
    invoke-virtual {v0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    :catchall_1
    :cond_1
    return-void
.end method
