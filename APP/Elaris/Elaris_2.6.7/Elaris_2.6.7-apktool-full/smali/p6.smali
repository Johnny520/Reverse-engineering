.class public final Lp6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp6;->a:Landroid/app/Dialog;

    .line 5
    .line 6
    iput-object p2, p0, Lp6;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lp6;->c:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lp6;->d:Landroid/view/View;

    .line 11
    .line 12
    iput-object p5, p0, Lp6;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lp6;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lp6;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lp6;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lp6;->i:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    :try_start_0
    iget-object p1, p0, Lp6;->a:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    :catchall_0
    iget-object v7, p0, Lp6;->i:Ljava/lang/String;

    .line 7
    .line 8
    const-wide/16 v8, 0x0

    .line 9
    .line 10
    iget-object v0, p0, Lp6;->b:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v1, p0, Lp6;->c:Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v2, p0, Lp6;->d:Landroid/view/View;

    .line 15
    .line 16
    iget-object v3, p0, Lp6;->e:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, p0, Lp6;->f:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v5, p0, Lp6;->g:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v6, p0, Lp6;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static/range {v0 .. v9}, Ls6;->a(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
