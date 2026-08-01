.class public final Li/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li/z0;->b:I

    iput-object p2, p0, Li/z0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/widget/AdapterView;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/widget/AdapterView;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/widget/AdapterView;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget p1, p0, Li/z0;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Li/z0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ls0/q;

    .line 9
    .line 10
    iget-object p2, p1, Ls0/q;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, LE0/c;

    .line 17
    .line 18
    iget-object p2, p2, LE0/c;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    const/16 p3, 0x2766

    .line 29
    .line 30
    if-eq p2, p3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p1, p1, Ls0/q;->d:Landroid/widget/EditText;

    .line 34
    .line 35
    const/16 p2, 0x8

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object p1, p1, Ls0/q;->d:Landroid/widget/EditText;

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :pswitch_0
    iget-object p1, p0, Li/z0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Landroidx/appcompat/widget/SearchView;

    .line 51
    .line 52
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView;->p(I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_1
    const/4 p1, -0x1

    .line 57
    if-eq p3, p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Li/z0;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Li/F0;

    .line 62
    .line 63
    iget-object p1, p1, Li/F0;->d:Li/t0;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    const/4 p2, 0x0

    .line 68
    invoke-virtual {p1, p2}, Li/t0;->setListSelectionHidden(Z)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    .line 1
    iget p1, p0, Li/z0;->b:I

    return-void
.end method
