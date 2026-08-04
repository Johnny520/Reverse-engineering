.class public final Lyyds/ᲀᛶᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public final ᛲᲈᲁ:Landroid/view/ActionProvider;

.field public ᛵᛸᛸᛷ:Lyyds/ᲀᛵᲁᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᛶᲇᛳ;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᲀᛶᛸ;->ᛲᲈᲁ:Landroid/view/ActionProvider;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛵᲁᛴ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lyyds/ᛵᛷᛸᲈ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛵᛷᛸᲈ;->ᲇᛱᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lyyds/ᛴᛴᛵᛸ;->ᛷᲈᲈᲁ:Z

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lyyds/ᛴᛴᛵᛸ;->ᲇᛱᛲ(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
