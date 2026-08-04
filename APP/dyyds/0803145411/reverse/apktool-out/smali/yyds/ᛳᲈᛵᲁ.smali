.class public final synthetic Lyyds/ᛳᲈᛵᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲀᲈᛶᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛳᲈᛵᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᲈᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛳᲈᛵᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᲈᛵᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᲈᛵᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛳᲈᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lyyds/ᲀᲈᛶᲈ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛱᛵᛷ;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p0, v1}, Lyyds/ᲀᲈᛶᲈ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛱᛵᛷ;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "PRAGMA query_only = 1"

    .line 20
    .line 21
    invoke-static {p0, v0}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
