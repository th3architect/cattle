/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DstackTable extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 827419255;

	/**
	 * The singleton instance of <code>dstack</code>
	 */
	public static final DstackTable DSTACK = new DstackTable();

	/**
	 * No further instances allowed
	 */
	private DstackTable() {
		super("dstack");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AccountTable.ACCOUNT,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.CredentialTable.CREDENTIAL,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DataTable.DATA,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangelogTable.DATABASECHANGELOG,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.DatabasechangeloglockTable.DATABASECHANGELOGLOCK,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostGroupTable.HOST_GROUP,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageTable.IMAGE,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageFormatTable.IMAGE_FORMAT,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ImageStoragePoolMapTable.IMAGE_STORAGE_POOL_MAP,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.InstanceTable.INSTANCE,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.InstanceHostMapTable.INSTANCE_HOST_MAP,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.IpAddressTable.IP_ADDRESS,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.IpAssignmentTable.IP_ASSIGNMENT,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ItemPoolTable.ITEM_POOL,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ItemPoolGeneratorTable.ITEM_POOL_GENERATOR,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NetworkTable.NETWORK,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.NicTable.NIC,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.OfferingTable.OFFERING,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ProcessInstanceTable.PROCESS_INSTANCE,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.SettingTable.SETTING,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolTable.STORAGE_POOL,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.VnetTable.VNET,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.VolumeTable.VOLUME,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.VolumeStoragePoolMapTable.VOLUME_STORAGE_POOL_MAP,
			io.github.ibuildthecloud.dstack.db.jooq.generated.tables.ZoneTable.ZONE);
	}
}