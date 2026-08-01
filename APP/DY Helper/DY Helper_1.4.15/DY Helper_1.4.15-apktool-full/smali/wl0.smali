.class public final synthetic Lwl0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/inputmethod/InputMethodManager;

.field public final synthetic η:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/view/inputmethod/InputMethodManager;Landroid/widget/EditText;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwl0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lwl0;->ζ:Landroid/view/inputmethod/InputMethodManager;

    .line 4
    .line 5
    iput-object p2, p0, Lwl0;->η:Landroid/widget/EditText;

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
    .locals 2

    .line 1
    iget v0, p0, Lwl0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwl0;->ζ:Landroid/view/inputmethod/InputMethodManager;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object p0, p0, Lwl0;->η:Landroid/widget/EditText;

    .line 12
    .line 13
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Lwl0;->ζ:Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object p0, p0, Lwl0;->η:Landroid/widget/EditText;

    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
