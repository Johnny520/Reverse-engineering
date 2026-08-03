.class public final synthetic Ljb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljb/e;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljb/e;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ljb/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ljb/b;->h:Ljb/e;

    .line 4
    .line 5
    iput-object p2, p0, Ljb/b;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Ljb/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljb/b;->h:Ljb/e;

    .line 7
    .line 8
    iget-object v0, v0, Ljb/e;->a:Lr8/g;

    .line 9
    .line 10
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, p0, Ljb/b;->i:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, Ljb/b;->h:Ljb/e;

    .line 24
    .line 25
    iget-object v0, v0, Ljb/e;->a:Lr8/g;

    .line 26
    .line 27
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    iget-object v2, p0, Ljb/b;->i:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
