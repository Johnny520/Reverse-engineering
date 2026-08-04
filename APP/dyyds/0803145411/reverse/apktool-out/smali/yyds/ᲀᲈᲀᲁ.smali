.class public final Lyyds/ᲀᲈᲀᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:I

.field public final synthetic ᲀᛲᛳᲀ:Landroid/widget/TextView;

.field public final synthetic ᲇᲈᛵᛷ:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᲈᲀᲁ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᲈᲀᲁ;->ᲇᲈᛵᛷ:Landroid/graphics/Typeface;

    .line 7
    .line 8
    iput p3, p0, Lyyds/ᲀᲈᲀᲁ;->ᛲᛴᛳᛲ:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲈᲀᲁ;->ᲇᲈᛵᛷ:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᲀᲈᲀᲁ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲀᲈᲀᲁ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
