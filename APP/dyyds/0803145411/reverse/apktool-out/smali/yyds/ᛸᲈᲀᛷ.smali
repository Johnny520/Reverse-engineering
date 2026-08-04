.class public final synthetic Lyyds/ᛸᲈᲀᛷ;
.super Lyyds/ᛲᲀᲇᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# static fields
.field public static final ᛷᲈᲈᲁ:Lyyds/ᛸᲈᲀᛷ;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᛸᲈᲀᛷ;

    .line 2
    .line 3
    const-string v4, "iterator()Ljava/util/Iterator;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, Lyyds/ᛵᲈᛴᛷ;

    .line 8
    .line 9
    const-string v3, "iterator"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lyyds/ᛲᲀᲇᛷ;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᛸᲈᲀᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛸᲈᲀᛷ;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛵᲈᛴᛷ;

    .line 2
    .line 3
    invoke-interface {p1}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
