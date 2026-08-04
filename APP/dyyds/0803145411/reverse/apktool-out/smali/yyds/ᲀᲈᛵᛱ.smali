.class public final Lyyds/ᲀᲈᛵᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᛸᛶᲀ;


# instance fields
.field public final ᲀᛲᛳᲀ:Ljava/security/MessageDigest;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛵᲁᛵᲁ;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᲁᛵᲁ;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᲀᲈᛵᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲁᛵᲁ;

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᲀᲈᛵᛱ;->ᲀᛲᛳᲀ:Ljava/security/MessageDigest;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᲀᛲᛳᲀ()Lyyds/ᛵᲁᛵᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲈᛵᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲁᛵᲁ;

    .line 2
    .line 3
    return-object p0
.end method
