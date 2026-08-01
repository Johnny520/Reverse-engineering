.class public final synthetic Lq8;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/lang/ClassLoader;

.field public final synthetic d:Lpd;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq8;->a:Landroid/app/Dialog;

    .line 5
    .line 6
    iput-object p2, p0, Lq8;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lq8;->c:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    iput-object p4, p0, Lq8;->d:Lpd;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lq8;->a:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq8;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iget-object v0, p0, Lq8;->c:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    iget-object p0, p0, Lq8;->d:Lpd;

    .line 11
    .line 12
    invoke-static {p1, v0, p0}, Li5;->P1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
