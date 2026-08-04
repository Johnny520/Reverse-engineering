.class public final synthetic Lyyds/ᲀᛷᛶᛸ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lyyds/ᲀᛷᛶᛸ;->ᲀᛲᛳᲀ:I

    iput-object p1, p0, Lyyds/ᲀᛷᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᲀᛷᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᲀᛷᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput-object p4, p0, Lyyds/ᲀᛷᛶᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛱᛷᛸᲈ;Lyyds/ᲀᲁᛳᛶ;Landroid/content/Context;Ljava/util/Map;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᲀᛷᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲀᛷᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᲀᛷᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lyyds/ᲀᛷᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lyyds/ᲀᛷᛶᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/content/DialogInterface;I)V
.end method
