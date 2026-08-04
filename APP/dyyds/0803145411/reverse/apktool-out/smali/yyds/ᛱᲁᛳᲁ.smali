.class public final Lyyds/ᛱᲁᛳᲁ;
.super Landroid/os/RemoteCallbackList;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:Landroidx/room/MultiInstanceInvalidationService;


# direct methods
.method public constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛱᲁᛳᲁ;->ᛲᲈᲁ:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/RemoteCallbackList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCallbackDied(Landroid/os/IInterface;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛵᲀᛸᲀ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛱᲁᛳᲁ;->ᛲᲈᲁ:Landroidx/room/MultiInstanceInvalidationService;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-interface {p0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
