.class public final Lr9/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic g:Lgg/s;

.field public final synthetic h:Landroid/widget/TextView;

.field public final synthetic i:Landroid/widget/EditText;

.field public final synthetic j:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lgg/s;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/c0;->g:Lgg/s;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/c0;->h:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/c0;->i:Landroid/widget/EditText;

    .line 9
    .line 10
    iput-object p4, p0, Lr9/c0;->j:Landroid/widget/EditText;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr9/c0;->g:Lgg/s;

    .line 2
    .line 3
    const/4 p2, -0x1

    .line 4
    iput p2, p1, Lgg/s;->g:I

    .line 5
    .line 6
    iget-object p1, p0, Lr9/c0;->i:Landroid/widget/EditText;

    .line 7
    .line 8
    iget-object p2, p0, Lr9/c0;->j:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-static {p1, p2}, Lr9/d0;->I0(Landroid/widget/EditText;Landroid/widget/EditText;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    new-instance p2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p3, "\u641c\u7d22\u7ed3\u679c: "

    .line 21
    .line 22
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p2, p0, Lr9/c0;->h:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
