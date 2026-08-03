.class public final synthetic Lf0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/widget/EditText;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/w;->a:Ljava/lang/String;

    iput-object p2, p0, Lf0/w;->b:Landroid/widget/EditText;

    iput-object p3, p0, Lf0/w;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    const-string p1, "$key"

    iget-object v0, p0, Lf0/w;->a:Ljava/lang/String;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$this_apply"

    iget-object v1, p0, Lf0/w;->b:Landroid/widget/EditText;

    invoke-static {v1, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$default"

    iget-object v2, p0, Lf0/w;->c:Ljava/lang/String;

    invoke-static {v2, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_1

    sget-object p1, Lc0/h1;->a:Lc0/h1;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    const/4 p2, 0x1

    invoke-virtual {p1, v0, v2, p2}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method
