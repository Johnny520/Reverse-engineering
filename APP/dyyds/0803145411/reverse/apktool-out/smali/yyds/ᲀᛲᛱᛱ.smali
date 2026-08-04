.class public final Lyyds/ᲀᛲᛱᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᛷᛸᛳ;


# instance fields
.field public ᛲᲈᲁ:Z

.field public ᛵᛸᛸᛷ:I

.field public final synthetic ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarContextView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionBarContextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lyyds/ᲀᛲᛱᛱ;->ᛲᲈᲁ:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᲀᛲᛱᛱ;->ᛲᲈᲁ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lyyds/ᲀᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 8
    .line 9
    iput-object v0, v1, Landroidx/appcompat/widget/ActionBarContextView;->ᛱᲈᲁ:Lyyds/ᛱᛶᛲᛷ;

    .line 10
    .line 11
    iget p0, p0, Lyyds/ᲀᛲᛱᛱ;->ᛵᛸᛸᛷ:I

    .line 12
    .line 13
    invoke-static {v1, p0}, Landroidx/appcompat/widget/ActionBarContextView;->ᛵᛸᛸᛷ(Landroidx/appcompat/widget/ActionBarContextView;I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᲀᛲᛱᛱ;->ᛲᲈᲁ:Z

    .line 3
    .line 4
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/appcompat/widget/ActionBarContextView;->ᛲᲈᲁ(Landroidx/appcompat/widget/ActionBarContextView;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lyyds/ᲀᛲᛱᛱ;->ᛲᲈᲁ:Z

    .line 8
    .line 9
    return-void
.end method
