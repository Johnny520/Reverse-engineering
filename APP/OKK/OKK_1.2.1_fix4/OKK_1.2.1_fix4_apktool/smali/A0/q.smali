.class public final LA0/q;
.super Ls0/j;
.source "SourceFile"


# instance fields
.field public final synthetic a:LA0/u;


# direct methods
.method public constructor <init>(LA0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/q;->a:LA0/u;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    iget-object p1, p0, LA0/q;->a:LA0/u;

    invoke-virtual {p1}, LA0/u;->b()LA0/v;

    move-result-object p1

    invoke-virtual {p1}, LA0/v;->a()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, LA0/q;->a:LA0/u;

    invoke-virtual {p1}, LA0/u;->b()LA0/v;

    move-result-object p1

    invoke-virtual {p1}, LA0/v;->b()V

    return-void
.end method
