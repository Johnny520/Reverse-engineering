.class public final Lyyds/ᛴᛵᛸᛳ;
.super Ljava/io/FilterInputStream;


# instance fields
.field public ᛲᛴᛳᛲ:J

.field public final ᲀᛲᛳᲀ:J

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x80

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;JLjava/lang/String;)V
    .locals 2

    .line 1
    const-wide v0, -0x853ee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x8544e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, Lyyds/ᛴᛵᛸᛳ;->ᲀᛲᛳᲀ:J

    .line 21
    .line 22
    iput-object p4, p0, Lyyds/ᛴᛵᛸᛳ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final native read()I
.end method

.method public final native read([BII)I
.end method

.method public final native skip(J)J
.end method

.method public final native ᛲᲈᲁ(J)V
.end method
