.class public final synthetic Lcom/example/dyhelper/ui/θ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic α:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/θ;->α:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const/4 p1, 0x6

    .line 2
    const/4 v0, 0x0

    .line 3
    if-eq p2, p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Θ:Lym1;

    .line 6
    .line 7
    if-eqz p3, :cond_5

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/16 p2, 0x42

    .line 14
    .line 15
    if-ne p1, p2, :cond_5

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lcom/example/dyhelper/ui/θ;->α:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 18
    .line 19
    iget-boolean p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ:Z

    .line 20
    .line 21
    if-eqz p1, :cond_5

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ξ()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 27
    .line 28
    const-string p2, "hexInput"

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v1, "input_method"

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    instance-of v1, p1, Landroid/view/inputmethod/InputMethodManager;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object p1, p3

    .line 54
    :goto_0
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p1, p0, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-static {p2}, Lln0;->и(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p3

    .line 72
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_4
    invoke-static {p2}, Lln0;->и(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p3

    .line 78
    :cond_5
    return v0
.end method
