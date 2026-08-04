.class public final synthetic Lyyds/ᛲᛴᛸᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛲᛷ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᛴᛲᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᛴᛸᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛲᛷ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    if-ne p2, p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p2, 0x1

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛲᛴᛸᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛲᛷ;

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛴᛴᛲᛷ;->ᛲᲈᲁ()V

    .line 14
    .line 15
    .line 16
    return p2

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method
