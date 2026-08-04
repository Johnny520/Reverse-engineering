.class public interface abstract Lyyds/ᛵᲇᛲᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public static ᛲᲈᲁ(Landroid/view/View;)Landroid/widget/TextView;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x102000b

    .line 5
    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, -0x1

    .line 14
    if-ne v0, v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Landroid/view/View;->setId(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, v2, :cond_1

    .line 25
    .line 26
    :goto_0
    check-cast p0, Landroid/widget/TextView;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    const-string p0, "You must set the ID value of TextView to android.R.id.message"

    .line 30
    .line 31
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_2
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    instance-of v0, p0, Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast p0, Landroid/widget/TextView;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    const-string p0, "You must include a TextView with an ID value of message (xml code: android:id=\"@android:id/message\", java code: view.setId(android.R.id.message))"

    .line 47
    .line 48
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract setDuration(I)V
.end method

.method public abstract setGravity(III)V
.end method

.method public abstract setMargin(FF)V
.end method

.method public abstract setText(Ljava/lang/CharSequence;)V
.end method

.method public abstract setView(Landroid/view/View;)V
.end method

.method public abstract show()V
.end method
