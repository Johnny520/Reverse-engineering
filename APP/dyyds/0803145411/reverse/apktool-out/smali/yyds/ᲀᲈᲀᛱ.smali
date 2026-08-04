.class public final synthetic Lyyds/ᲀᲈᲀᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᲇᛲᛱ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛵᛸᛵᛱ;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲀᛴᛸᛴ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛵᛸᛵᛱ;Lyyds/ᲀᛴᛸᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᲈᲀᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛸᛵᛱ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᲈᲀᛱ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛴᛸᛴ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲈᲀᛱ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛴᛸᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲀᲈᲀᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛸᛵᛱ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
