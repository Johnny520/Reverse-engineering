.class public final synthetic Lyyds/ᲁᛲᲈᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:I

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᲀᛷᛷ;III)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᲁᛲᲈᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᛲᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 4
    .line 5
    iput p2, p0, Lyyds/ᲁᛲᲈᛷ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    iput p3, p0, Lyyds/ᲁᛲᲈᛷ;->ᲇᲇᲇᛱ:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᲁᛲᲈᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget v3, p0, Lyyds/ᲁᛲᲈᛷ;->ᲇᲇᲇᛱ:I

    .line 7
    .line 8
    iget v4, p0, Lyyds/ᲁᛲᲈᛷ;->ᛲᛴᛳᛲ:I

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    invoke-virtual {v0, v4, v3, v5}, Lyyds/ᛲᛱᛷᲀ;->ᲇᛱᛲ(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {p0, v2, v2, v0}, Lyyds/ᛴᲀᛷᛷ;->ᛲᲈᲁ(IILjava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-object v1

    .line 27
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 28
    .line 29
    invoke-virtual {v0, v4, v3}, Lyyds/ᛲᛱᛷᲀ;->ᛵᛶᛲᲀ(II)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catch_1
    move-exception v0

    .line 34
    invoke-virtual {p0, v2, v2, v0}, Lyyds/ᛴᲀᛷᛷ;->ᛲᲈᲁ(IILjava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    return-object v1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
