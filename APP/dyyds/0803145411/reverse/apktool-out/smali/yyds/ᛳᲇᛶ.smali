.class public final synthetic Lyyds/ᛳᲇᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛵᛱᛷᛳ;

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛷ;

.field public final synthetic ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᲀᲈᛷ;Lcom/ss/android/ugc/awemes/MainActivity;Lyyds/ᛵᛱᛷᛳ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲇᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛷ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛳᲇᛶ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛳᲇᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛱᛷᛳ;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 2
    .line 3
    iget-object p1, p0, Lyyds/ᛳᲇᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛷ;

    .line 4
    .line 5
    iget-boolean p1, p1, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lyyds/ᛳᲇᛶ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 10
    .line 11
    iget-object v0, p1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛲᲇ:Lyyds/ᛵᛱᛷᛳ;

    .line 12
    .line 13
    iget-object v0, v0, Lyyds/ᛵᛱᛷᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛳᲇᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛱᛷᛳ;

    .line 16
    .line 17
    iget-object v1, p0, Lyyds/ᛵᛱᛷᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᛸᛸᛷ(Lyyds/ᛵᛱᛷᛳ;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
