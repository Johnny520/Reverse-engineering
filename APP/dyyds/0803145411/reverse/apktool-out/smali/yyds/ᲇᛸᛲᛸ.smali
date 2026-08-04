.class public final Lyyds/ᲇᛸᛲᛸ;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;


# direct methods
.method public constructor <init>(Lyyds/ᲇᛴᲈᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᲇᛱᛴᛲ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᲇᛱᛴᛲ;-><init>(Lyyds/ᲇᛸᛲᛸ;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 7
    new-instance p1, Lyyds/ᲇᛱᛴᛲ;

    invoke-direct {p1, p0}, Lyyds/ᲇᛱᛴᛲ;-><init>(Lyyds/ᲇᛸᛲᛸ;)V

    return-object p1
.end method
