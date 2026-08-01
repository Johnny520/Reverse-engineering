.class public final Lte;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:[Lw6;

.field public final synthetic c:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Lw6;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lte;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lte;->b:[Lw6;

    .line 7
    .line 8
    iput-object p3, p0, Lte;->c:Landroid/app/Dialog;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lte;->b:[Lw6;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, Lte;->a:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/mr/elaris/w;->d(Landroid/content/Context;Lw6;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lte;->c:Landroid/app/Dialog;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
