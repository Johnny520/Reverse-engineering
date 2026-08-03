.class public final synthetic Lwb/mi;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(ILfg/l;Ljava/lang/String;Ljava/lang/String;Lfg/l;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/mi;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lwb/mi;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/mi;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/mi;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/mi;->k:Lfg/l;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/mi;->l:Landroid/content/Context;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    iget v1, p0, Lwb/mi;->g:I

    .line 4
    .line 5
    iget-object v5, p0, Lwb/mi;->k:Lfg/l;

    .line 6
    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lwb/mi;->h:Lfg/l;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    new-instance v2, Lwb/b3;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    const-string v7, "|"

    .line 17
    .line 18
    iget-object v3, p0, Lwb/mi;->i:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, p0, Lwb/mi;->j:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct/range {v2 .. v7}, Lwb/b3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;ZLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    iget-object v0, p0, Lwb/mi;->l:Landroid/content/Context;

    .line 30
    .line 31
    instance-of v2, v0, Landroid/app/Activity;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, Landroid/app/Activity;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v2, 0x0

    .line 40
    :goto_0
    if-nez v2, :cond_2

    .line 41
    .line 42
    const-string v1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sget-object v3, Lwb/iq;->a:Lwb/iq;

    .line 54
    .line 55
    new-instance v4, Lwb/da;

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    invoke-direct {v4, v5, v0, v6}, Lwb/da;-><init>(Lfg/l;Landroid/content/Context;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2, v1, v4}, Lwb/iq;->b(Landroid/app/Activity;ILfg/l;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 65
    .line 66
    return-object v0
.end method
