.class public final Lb2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lb2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Lb2;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lve;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p1, Lve;->a:Z

    .line 12
    .line 13
    iget-object p1, p1, Lve;->b:Ljava/lang/Thread;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 18
    .line 19
    .line 20
    :cond_0
    :try_start_0
    iget-object p0, p0, Lb2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Landroid/app/Dialog;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :catchall_0
    return-void

    .line 28
    :pswitch_0
    iget-object p1, p0, Lb2;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Le2;

    .line 31
    .line 32
    iget-object p0, p0, Lb2;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ll1;

    .line 35
    .line 36
    invoke-static {p1, p0}, Lg2;->o(Le2;Ll1;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object p1, p0, Lb2;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Le2;

    .line 43
    .line 44
    iget-object p0, p0, Lb2;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Landroid/widget/EditText;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string p0, ""

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_0
    invoke-static {p1, p0}, Lg2;->j(Le2;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
