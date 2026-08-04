.class public final Lyyds/ᛷᲈᛳᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:D

.field public final synthetic ᛵᛸᛸᛷ:D

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛳᛴᛲᲀ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛴᛲᲀ;DD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᛲᲀ;

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᛷᲈᛳᛲ;->ᛲᲈᲁ:D

    .line 7
    .line 8
    iput-wide p4, p0, Lyyds/ᛷᲈᛳᛲ;->ᛵᛸᛸᛷ:D

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 2
    .line 3
    .line 4
    move-object p6, p1

    .line 5
    move-object p1, p0

    .line 6
    new-instance p0, Lyyds/ᛴᛸᲁᛵ;

    .line 7
    .line 8
    iget-wide p2, p1, Lyyds/ᛷᲈᛳᛲ;->ᛲᲈᲁ:D

    .line 9
    .line 10
    iget-wide p4, p1, Lyyds/ᛷᲈᛳᛲ;->ᛵᛸᛸᛷ:D

    .line 11
    .line 12
    invoke-direct/range {p0 .. p6}, Lyyds/ᛴᛸᲁᛵ;-><init>(Lyyds/ᛷᲈᛳᛲ;DDLandroid/view/View;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 p1, 0x64

    .line 16
    .line 17
    invoke-virtual {p6, p0, p1, p2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method
