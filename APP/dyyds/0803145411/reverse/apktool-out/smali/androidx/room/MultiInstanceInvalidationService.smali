.class public final Landroidx/room/MultiInstanceInvalidationService;
.super Landroid/app/Service;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

.field public ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Lyyds/ᲈᛸ;

.field public final ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛱᲁᛳᲁ;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lyyds/ᛱᲁᛳᲁ;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 17
    .line 18
    new-instance v0, Lyyds/ᲈᛸ;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lyyds/ᲈᛸ;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲇᲇᛱ:Lyyds/ᲈᛸ;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲇᲇᛱ:Lyyds/ᲈᛸ;

    .line 2
    .line 3
    return-object p0
.end method
