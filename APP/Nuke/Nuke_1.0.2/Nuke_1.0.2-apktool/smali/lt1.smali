.class public final synthetic Llt1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic h:Lba1;

.field public final synthetic i:Ly50;


# direct methods
.method public synthetic constructor <init>(Lba1;Ly50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llt1;->h:Lba1;

    .line 5
    .line 6
    iput-object p2, p0, Llt1;->i:Ly50;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Llt1;->h:Lba1;

    .line 2
    .line 3
    iget-object p0, p0, Llt1;->i:Ly50;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lba1;->b(Lha1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
