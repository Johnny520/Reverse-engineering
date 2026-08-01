.class public final Lxhss/ᛲᲀᛳᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛷᛴ;


# direct methods
.method public constructor <init>(Landroid/view/View;Lxhss/ᛸᛱᛷᛴ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lxhss/ᛲᲀᛳᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛷᛴ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lxhss/ᛲᲀᛳᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛷᛴ;

    .line 6
    .line 7
    check-cast p0, Lxhss/ᛳᛲᲈᛵ;

    .line 8
    .line 9
    iget-object p2, p0, Lxhss/ᛳᛲᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛴᛱᲀ;

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᛳᛲᲈᛵ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲇᛱ;

    .line 12
    .line 13
    iget-boolean v0, p2, Lxhss/ᛷᛴᛱᲀ;->ᛷᛵᛵᲈ:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Lxhss/ᲇᲇᛱ;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lxhss/ᲇᲇᛱ;-><init>(Lxhss/ᲇᲇᛱ;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1, v0}, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ(Lxhss/ᲀᛳᛲᛶ;Lxhss/ᲇᲇᛱ;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p1}, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ()Landroid/view/WindowInsets;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
