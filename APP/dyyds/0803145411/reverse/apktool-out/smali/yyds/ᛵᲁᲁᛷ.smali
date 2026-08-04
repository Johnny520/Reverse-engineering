.class public final Lyyds/ᛵᲁᲁᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛵᲁᲁᛷ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛵᲁᲁᛷ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛵᲁᲁᛷ;->ᛲᲈᲁ:Lyyds/ᛵᲁᲁᛷ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᲁᛶᲁᲀ;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyyds/\u1c81\u16f6\u1c81\u1c80;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    .line 1
    new-instance p0, Lyyds/ᲈᛴᛴᛷ;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0, p1}, Lyyds/ᲈᛴᛴᛷ;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    check-cast p3, Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    check-cast p2, Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    invoke-interface {p1, p2}, Landroid/window/OnBackInvokedDispatcher;->unregisterOnBackInvokedCallback(Landroid/window/OnBackInvokedCallback;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
