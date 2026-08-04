.class public final synthetic Lyyds/ᛴᛳᲁᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛸᛶ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛲᛴᛴᛱ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛲᛴᛴᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛳᲁᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛴᛴᛱ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᲇᲈᛵᛷ(Lyyds/ᲁᲇᛴᲀ;Lyyds/ᛳᛷᛵᛷ;)V
    .locals 0

    .line 1
    sget-object p1, Lyyds/ᛳᛷᛵᛷ;->ON_START:Lyyds/ᛳᛷᛵᛷ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᛳᲁᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛴᛴᛱ;

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lyyds/ᛲᛴᛴᛱ;->ᛲᛴᛳᛲ:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p1, Lyyds/ᛳᛷᛵᛷ;->ON_STOP:Lyyds/ᛳᛷᛵᛷ;

    .line 12
    .line 13
    if-ne p2, p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lyyds/ᛲᛴᛴᛱ;->ᛲᛴᛳᛲ:Z

    .line 17
    .line 18
    :cond_1
    return-void
.end method
