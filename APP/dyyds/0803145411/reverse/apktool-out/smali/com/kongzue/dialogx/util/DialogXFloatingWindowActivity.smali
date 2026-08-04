.class public Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static ᲇᲇᲇᛱ:Ljava/lang/ref/WeakReference;


# virtual methods
.method public final finish()V
    .locals 1

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->ᲇᲇᲇᛱ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->ᲇᲇᲇᛱ:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sput-object p1, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->ᲇᲇᲇᛱ:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    throw p0
.end method
