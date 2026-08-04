.class public final Lyyds/ᛵᲀᲁᲀ;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛵᲀᲁᲀ;->ᲀᛲᛳᲀ:I

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛵᲀᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/Throwable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᲀᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object p0
.end method
