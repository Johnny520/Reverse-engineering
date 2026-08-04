.class public final Landroidx/lifecycle/SavedStateHandleAttacher;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛸᛶ;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᛲᲀᛸᛳ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᲀᛸᛳ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/SavedStateHandleAttacher;->ᲀᛲᛳᲀ:Lyyds/ᛲᲀᛸᛳ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᲇᲈᛵᛷ(Lyyds/ᲁᲇᛴᲀ;Lyyds/ᛳᛷᛵᛷ;)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛳᛷᛵᛷ;->ON_CREATE:Lyyds/ᛳᛷᛵᛷ;

    .line 2
    .line 3
    if-ne p2, v0, :cond_3

    .line 4
    .line 5
    invoke-interface {p1}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲇᲇᛱ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Landroidx/lifecycle/SavedStateHandleAttacher;->ᲀᛲᛳᲀ:Lyyds/ᛲᲀᛸᛳ;

    .line 13
    .line 14
    iget-boolean p1, p0, Lyyds/ᛲᲀᛸᛳ;->ᛵᛸᛸᛷ:Z

    .line 15
    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    iget-object p1, p0, Lyyds/ᛲᲀᛸᛳ;->ᛲᲈᲁ:Lyyds/ᛲᛴᛴᛱ;

    .line 19
    .line 20
    const-string p2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lyyds/ᛲᛴᛴᛱ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lyyds/ᛲᲀᛸᛳ;->ᲀᛲᛳᲀ:Landroid/os/Bundle;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iput-object p2, p0, Lyyds/ᛲᲀᛸᛳ;->ᲀᛲᛳᲀ:Landroid/os/Bundle;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Lyyds/ᛲᲀᛸᛳ;->ᛵᛸᛸᛷ:Z

    .line 47
    .line 48
    iget-object p0, p0, Lyyds/ᛲᲀᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 49
    .line 50
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lyyds/ᛲᛸᛶᲁ;

    .line 55
    .line 56
    :cond_2
    return-void

    .line 57
    :cond_3
    const-string p0, "Next event must be ON_CREATE, it was "

    .line 58
    .line 59
    invoke-static {p2, p0}, Lyyds/ᛱᛸᛶᛲ;->ᲀᛲᛲᲇ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
