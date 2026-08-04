.class public final synthetic Lyyds/ᲀᲇᲈᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᲈᛲ;
.implements Lyyds/ᲁᛳᲀᲇ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲀᲇᲈᲀ;->ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 2
    .line 3
    sget-object p1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲀᲇᲈᲀ;->ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛸᲁᲇ()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᲈᛶᲈᛴ;)Lyyds/ᲈᛶᲈᛴ;
    .locals 5

    .line 1
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 2
    .line 3
    const-wide v0, -0xf706e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    const-wide v0, -0xf70be68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x287

    .line 20
    .line 21
    iget-object v1, p2, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lyyds/ᲈᛲᲁᛳ;->ᛱᲈᲁ(I)Lyyds/ᛸᲀᲁᛲ;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-wide v1, -0xf712e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    iget v1, v0, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 36
    .line 37
    iget v2, v0, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 38
    .line 39
    const/16 v3, 0x8

    .line 40
    .line 41
    iget-object p0, p0, Lyyds/ᲀᲇᲈᲀ;->ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    add-int/2addr v3, v2

    .line 48
    iget v2, v0, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ:I

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-virtual {p1, v1, v3, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 52
    .line 53
    .line 54
    iget p1, v0, Lyyds/ᛸᲀᲁᛲ;->ᲇᲈᛵᛷ:I

    .line 55
    .line 56
    iput p1, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᲀᲈᛴ:I

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᲈᲁ()V

    .line 59
    .line 60
    .line 61
    return-object p2
.end method
